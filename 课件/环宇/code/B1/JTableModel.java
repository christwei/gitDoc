package com.swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JTableModel {
    
    JFrame jf = new JFrame("表格Model应用");
    JTable table;
    // 定义二维数组作为表格数据
    Object[][] tableData =
    {
        new Object[]{"李清照" , 29 , "女"},
        new Object[]{"苏格拉底", 56 , "男"},
        new Object[]{"李白", 35 , "男"},
        new Object[]{"弄玉", 18 , "女"},
        new Object[]{"虎头" , 2 , "男"}
    };
    // 定义一维数据作为列标题
    Object[] columnTitle = {"姓名" , "年龄" , "性别"};
    
    class CustmTableModel extends DefaultTableModel {
        @Override
        public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
        }

        public CustmTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }
        
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new JTableModel().init();

    }

    private void init() {
        // 以二维数组和一维数组来创建一个JTable对象
        table = new JTable(new CustmTableModel(tableData,columnTitle));
        table.setRowSorter(new TableRowSorter(table.getModel()));
        
        jf.add(new JScrollPane(table));
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}
