/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.Utils;

import com.sun.net.httpserver.Headers;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Oscar2
 */
public class DynamicTable<T extends GenericEntity> {
    private final Class<T> classType;
    private DynamicTableModel<T> tModel;
    public DynamicTable(Class<T> classType){
        this.classType=classType;
        tModel = new DynamicTableModel<>(classType);
    }
    public DynamicTableModel<T> getTableModel(){
        return tModel;
    }
    public void setJTableModels(JTable jTable){
        setJTableModels(jTable, false);
    }
    public void setJTableModels(JTable jTable,boolean autoColResize){
        TableHeader[] headers = getTableHeadersAnnotation().toArray(TableHeader[]::new);
        //String[] hNames = headers.map((h)->h.name()).toArray(String[]::new);
        //System.out.println("Headers: "+String.join("; ", getTableHeaders()));
        //headers.forEach((h)->{System.out.println(h.name()+"; ");});
        //tModel = new DynamicTableModel<>(classType);
        //tModel.setColumnCount(headers.length);
        jTable.setModel(tModel);
        if(!autoColResize)
            jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel cModel = jTable.getColumnModel();
        int i =0;
        for(TableHeader header:headers){
            
            TableColumn tCol = cModel.getColumn(i);
            tCol.setHeaderValue(header.name());
            if(!autoColResize){
                if(header.columnSize()>0){
                    tCol.setPreferredWidth(header.columnSize());
                }
                else{
                    tCol.setPreferredWidth(200);
                }
            }
            JComboBox<String> ops = new JComboBox<>(){
                @Override
                public String toString(){
                    return getSelectedItem().toString();
                }
            };
            JCheckBox checkbox = new JCheckBox();
            switch(header.columnType()){
                case ColumnType.COMBOBOX:
                    DefaultComboBoxModel<String> boxModel = new DefaultComboBoxModel<>();
                    
                    int iIndex=Arrays.asList(header.enumClass().getInterfaces()).indexOf(GenericEntity.class);
                    if(iIndex<0){
                        List<String> options = Arrays.stream(header.enumClass().getEnumConstants()).map((o)->o.toString()).toList();
                        boxModel.addAll(options);
                    }
                    /*boxModel.addElement("Masculino");
                    boxModel.addElement("Femenino");*/
                    
                    ops.setModel(boxModel);
                    tModel.setColumnClass(i, header.enumClass());
                    tCol.setCellEditor(new DefaultCellEditor(ops));
                    break;
                case ColumnType.CHECKBOX:
                    //tCol.setCellEditor(new DefaultCellEditor(checkbox));
                    //tModel.setColumnClass(i, Boolean.class);
                    break;
                default:
                    //tModel.setColumnClass(i, String.class);
                    break;
            }
            /*if(i==2){
                    tModel.setColumnClass(i, JComboBox.class);
            }*/
            i++;
        }
        jTable.setColumnModel(cModel);
    }
    
    public static <T> List<String> getEnumFromClass(Class<T> tClass){
        int iIndex=Arrays.asList(tClass.getInterfaces()).indexOf(GenericEntity.class);
        if(iIndex<0){
            return Arrays.stream(tClass.getEnumConstants()).map((o)->o.toString()).toList();
        }
        return null;
    }
    /*public static <T extends GenericEntity> T getObjectFromEnumString(Class<T> tClass, String){
        
        GenericJpaController<?> jpaEnum = new GenericJpaController(tClass);
        
        return jpaEnum.findEntity(1);
    }*/
    
    public static <T> Long getIdFromEnumClass(Class<T> tClass, String value){
        Pattern enumIdPat = Pattern.compile("\\[.+?\\].*");
        Matcher mat = enumIdPat.matcher(value);
        try{
            if(mat.find()){
                return Long.parseLong(mat.group(1));
            }
            else{
                return Long.valueOf(getEnumFromClass(tClass).indexOf(value));
            }
        }
        finally{
            return Long.valueOf(-1);
        }
    }
    
    public static <T extends GenericEntity> void LoadTableFromList(List<T> list, JTable jTable){
        DynamicTableModel tModel = (DynamicTableModel)jTable.getModel();
        tModel.setValues(list);
        /*tModel.clearValues();
        for(T ent:list){
            tModel.addRow(ent);
        }*/
    }
    
    public static <T extends GenericEntity> Stream<Field> getDynTableFields(Class<T> tClass){
        List<Field> fields = new ArrayList<>();
        fields.addAll(Arrays.asList(tClass.getDeclaredFields()));
        Class<?> sClass = tClass.getSuperclass();
        while(sClass!=null){
            fields.addAll(0,Arrays.asList(sClass.getDeclaredFields()));
            sClass=sClass.getSuperclass();
        }
        
        
        return fields.stream().filter(f->f.isAnnotationPresent(TableHeader.class));
    }
    private Stream<TableHeader> getTableHeadersAnnotation(){
        Stream<Field> fields = getDynTableFields(classType);
        
        Stream<TableHeader> th = fields.map(f->f.getAnnotation(TableHeader.class));
        return th;
    }
    public String[] getTableHeaders(){
        return getTableHeadersAnnotation().map(f->f.name()).toArray(String[]::new);
    }
}
