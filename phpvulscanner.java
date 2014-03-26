import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenu;


import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JComboBox;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.tree.*;
import javax.swing.event.*;




public class phpscan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenu jMenu1 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem1 = null;
	private JMenuItem jMenuItem2 = null;

	private JMenuItem jMenuItem5 = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JTextField jTextField = null;
	private JButton jButton = null;
	private JMenuItem jMenuItem6 = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel1 = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel2 = null;
	private JTextArea jTextArea = null;
	private JPanel jPanel2 = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTable = null;
	private JLabel jLabel3 = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel31 = null;
	private JScrollPane jScrollPane = null;
	private DefaultTable defaultTable = null;
	public JTextField jTextField1 = null;
	private JScrollPane jScrollPane2 = null;
	
	public String filepath = "";  //  @jve:decl-index=0:
	private JCheckBoxMenuItem jCheckBoxMenuItem_re = null;
	private JCheckBoxMenuItem jCheckBoxMenuItem_kw = null;
	
	/**
	 * This method initializes jCheckBoxMenuItem_re	
	 * 	
	 * @return javax.swing.JCheckBoxMenuItem	
	 */
	private JCheckBoxMenuItem getJCheckBoxMenuItem_re() {
		if (jCheckBoxMenuItem_re == null) {
			jCheckBoxMenuItem_re = new JCheckBoxMenuItem("正则表达式",true);
			jCheckBoxMenuItem_re.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
		        	if(jCheckBoxMenuItem_re.isSelected()){
		        		jCheckBoxMenuItem_kw.setSelected(false);
		        	}else{
		        		jCheckBoxMenuItem_re.setSelected(true);
		        	}
//					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jCheckBoxMenuItem_re;
	}


	/**
	 * This method initializes jCheckBoxMenuItem_kw	
	 * 	
	 * @return javax.swing.JCheckBoxMenuItem	
	 */
	private JCheckBoxMenuItem getJCheckBoxMenuItem_kw() {
		if (jCheckBoxMenuItem_kw == null) {
			jCheckBoxMenuItem_kw = new JCheckBoxMenuItem("关键字");
			jCheckBoxMenuItem_kw.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
		        	if(jCheckBoxMenuItem_kw.isSelected()){
		        		jCheckBoxMenuItem_re.setSelected(false);
		        	}else{
		        		jCheckBoxMenuItem_kw.setSelected(true);
		        	}
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jCheckBoxMenuItem_kw;
	}


	/**
	 * @param args
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				phpscan thisClass = new phpscan();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}
    
	
	/**
	 * This is the default constructor
	 */
	public phpscan() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(781, 626);
		this.setJMenuBar(getJJMenuBar());
		this.setName("frame0");
		this.setContentPane(getJContentPane());
		this.setTitle("PHP代码审计辅助系统 beta 0.0 powered by zztzyjzw");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.setName("");
			jContentPane.add(getJPanel(), BorderLayout.NORTH);
			jContentPane.add(getJPanel1(), BorderLayout.WEST);
			jContentPane.add(getJPanel2(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.setPreferredSize(new Dimension(30, 30));
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("扫描任务");
			jMenu.add(getJMenuItem1());
			jMenu.add(getJMenuItem2());
			jMenu.add(getJMenuItem6());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("扫描配置");

			jMenu1.add(getJCheckBoxMenuItem_re());
			jMenu1.add(getJCheckBoxMenuItem_kw());
		}
		return jMenu1;
	}

	/**
	 * This method initializes jMenu2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("帮助");
			jMenu2.add(getJMenuItem5());
		}
		return jMenu2;
	}


	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem("开始扫描");
		}
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
//				System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				scan();
//				JOptionPane.showMessageDialog(null, "scan");
			}
		});
		return jMenuItem1;
	}

	/**
	 * This method initializes jMenuItem2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem("结束扫描");
		}
		return jMenuItem2;
	}


	/**
	 * This method initializes jMenuItem5	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem("关于");
		}
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				JOptionPane.showMessageDialog(null, "PHP代码审计辅助系统 beta 0.0 powered by zztzyjzw 2014");
			}
		});
		return jMenuItem5;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("编码:");
			jLabel = new JLabel();
			jLabel.setText("关键字：");
			jPanel = new JPanel();
			jPanel.setLayout(new FlowLayout());
			jPanel.setPreferredSize(new Dimension(30, 30));
			jPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel.add(jLabel, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(getJComboBox(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setPreferredSize(new Dimension(250, 20));
		}
		return jTextField;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setPreferredSize(new Dimension(80, 18));
			jButton.setText("查找");
		}
		return jButton;
	}

	/**
	 * This method initializes jMenuItem6	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem6() {
		if (jMenuItem6 == null) {
			jMenuItem6 = new JMenuItem("退出");
		}
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.exit(1);
			}
		});
		return jMenuItem6;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setPreferredSize(new Dimension(100, 18));
			jButton1.setText("开始扫描");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
//					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					scan();
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setPreferredSize(new Dimension(100, 18));
			jButton2.setText("结束扫描");
		}
		return jButton2;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("  文件管理器：");
			jLabel2.setPreferredSize(new Dimension(38, 30));
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.setPreferredSize(new Dimension(200, 20));
			jPanel1.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
			jPanel1.add(jLabel2, BorderLayout.NORTH);
			jPanel1.add(getJTextField1(), BorderLayout.SOUTH);
			jPanel1.add(getJScrollPane2(), BorderLayout.CENTER);
			//添加tree
			FileTree1 filetree = new FileTree1();	
			
			jScrollPane2.getViewport().add(filetree.m_tree);

		}
		return jPanel1;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
//		Object[] decode={"GBK","UTF-8"};
		if (jComboBox == null) {
//			jComboBox = new JComboBox(decodes);
			jComboBox = new JComboBox();
			jComboBox.setPreferredSize(new Dimension(60, 18));	
			jComboBox.addItem("UTF-8");
			jComboBox.addItem("GBK");
		}
		return jComboBox;
	}



	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
			jPanel2.add(getJScrollPane1(), BorderLayout.SOUTH);
			jPanel2.add(getJPanel3(), BorderLayout.NORTH);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setPreferredSize(new Dimension(3, 150));
			jScrollPane1.setBorder(null);
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jLabel31 = new JLabel();
			jLabel31.setText("代码内容：");
			jLabel31.setPreferredSize(new Dimension(38, 30));
			jPanel3 = new JPanel();
			jPanel3.setLayout(new BorderLayout());
			jPanel3.setPreferredSize(new Dimension(3, 380));
			jPanel3.add(jLabel31, BorderLayout.NORTH);
			jPanel3.add(getJScrollPane(), BorderLayout.CENTER);
		}
		return jPanel3;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		//初始化表格		
		defaultTable = new DefaultTable();		
		jTable = new JTable(defaultTable);
		jTable.setAutoResizeMode(jTable.AUTO_RESIZE_OFF);
		jTable.setAutoCreateRowSorter(true);
		jTable.setRowHeight(30);

		jTable.setShowHorizontalLines(false);
		jTable.setShowVerticalLines(false);
		jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//设置列宽度
		TableColumnModel cm = jTable.getColumnModel();
	
		for(int i=0;i<cm.getColumnCount();i++){
			int width = defaultTable.COLUNM_WIDTHS[i];
			cm.getColumn(i).setPreferredWidth(width);
			
		}
		if(jTable.getRowCount()>0)
			jTable.setRowSelectionInterval(0, 0);
		
		//使表格表头的字体居中，若想居左居右，只要改变其属性
		/*
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.LEFT);
		jTable.setDefaultRenderer(Object.class, renderer);
		*/


/*		
		TableColumn column = jTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(1300);
*/		
        //添加table
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(jTable);

		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
		}
		return jScrollPane2;
	}

	//实现插入表功能，并更新表格
	public void UpdateTable(Vector v){
		defaultTable.vect.removeAllElements();
		for(int k=0;k<v.size();k+=2){
			Vector rowdata = new Vector(2);
			rowdata.add(v.elementAt(k));
			rowdata.add(v.elementAt(k+1));
			defaultTable.vect.add(rowdata);
		}
		//刷新JTable
		jTable.repaint();
		jTable.updateUI();

	}
	
	
	//文件树实现
	class FileTree1{
		private DefaultTreeModel m_model;
		public JTree  m_tree;
		


		public FileTree1(){
		  DefaultMutableTreeNode top = new DefaultMutableTreeNode(new  IconData(null,null ,"ROOT")); // 用一个根结点创建树 	
		  DefaultMutableTreeNode node;
		  File[] roots = File.listRoots(); //获得磁盘分区 
		  
		  for (int k=0; k<roots.length;k++){//每个分区进行访问
			 node = new DefaultMutableTreeNode(new IconData(null, null, new FileNode(roots[k])));
		     top.add(node);
		     node.add( new DefaultMutableTreeNode(new Boolean(true)));
		  }
		
		  m_model = new DefaultTreeModel(top);
		  m_tree = new JTree(m_model);
		
		  m_tree.putClientProperty("JTree.lineStyle", "Angled");
		  //使用渲染器
		  TreeCellRenderer renderer = new IconCellRenderer();
		  m_tree.setCellRenderer(renderer);	
		  //添加动作
		  m_tree.addTreeExpansionListener(new DirExpansionListener());//添加展开动作
		  m_tree.addTreeSelectionListener(new DirSelectionListener());//添加选中动作	
		  m_tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION); //设置选中模式
		  

		  m_tree.setShowsRootHandles(true); 
		  m_tree.setEditable(false);
		  
		  //添加右键
		  new TreePopupMenu();
		
		}

		DefaultMutableTreeNode getTreeNode(TreePath path){
		  return (DefaultMutableTreeNode)(path.getLastPathComponent());
		}

		FileNode getFileNode(DefaultMutableTreeNode node){
		  if (node == null)
		      return null;
		  Object obj = node.getUserObject();
		  if (obj instanceof IconData)
		      obj = ((IconData)obj).getObject();
		  if (obj instanceof FileNode)
		      return (FileNode)obj;
		  else
		      return null;
		}

	    // Make sure expansion is threaded and updating the tree model
	    // only occurs within the event dispatching thread.
	    class DirExpansionListener implements TreeExpansionListener{
	        public void treeExpanded(TreeExpansionEvent event){
	             final DefaultMutableTreeNode node = getTreeNode(event.getPath());
	             final FileNode fnode = getFileNode(node);

	            Thread runner = new Thread() 
	            {
	              public void run() {
	                if (fnode != null && fnode.expand(node)) {
	                  Runnable runnable = new Runnable() {
	                    public void run() {
	                       m_model.reload(node);
	                    }
	                  };
	                  SwingUtilities.invokeLater(runnable);
	                }
	              }
	            };
	            runner.start();
	        }

	        public void treeCollapsed(TreeExpansionEvent event) {}
	    }


		class DirSelectionListener implements TreeSelectionListener {
		  public void valueChanged(TreeSelectionEvent event){
		   DefaultMutableTreeNode node = getTreeNode(event.getPath());
		   FileNode fnode = getFileNode(node);
		   if (fnode != null){
		     filepath = fnode.getFile().getAbsolutePath();
		     jTextField1.setText(filepath);
		   }	     
		   else{
		     filepath = "";
		     jTextField1.setText(filepath);
		   }
		  }
		}
		//添加右键功能
		class TreePopupMenu implements MouseListener,ActionListener{
			  //添加右键功能
		    JPopupMenu popMenu;
		    JMenuItem startItem;
		    JMenuItem stopItem;

			public TreePopupMenu() {
				popMenu = new JPopupMenu();
			    startItem = new JMenuItem("开始扫描");
			    startItem.addActionListener(this);
			    stopItem = new JMenuItem("结束扫描");
			    stopItem.addActionListener(this);

			    popMenu.add(startItem);
			    popMenu.add(stopItem);

			    m_tree.addMouseListener(this);
				
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getClickCount()==2){//鼠标双击,打开选择的文件
//					JOptionPane.showMessageDialog(null, "open file");
					FileScan filescan = new FileScan(filepath);
					filescan.Fileread();
					UpdateTable(filescan.vector);
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
		        TreePath path = m_tree.getPathForLocation(arg0.getX(), arg0.getY());  
		        if (path == null) {
		            return;
		        }
		        m_tree.setSelectionPath(path);

		        if (arg0.getButton() == 3) {
		            popMenu.show(m_tree, arg0.getX(), arg0.getY());
		        }
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				 DefaultMutableTreeNode node = (DefaultMutableTreeNode) m_tree.getLastSelectedPathComponent();
			        if (arg0.getSource() == startItem) {
//			            ((DefaultTreeModel) m_tree.getModel()).insertNodeInto(new DefaultMutableTreeNode("Test"),node, node.getChildCount());
//			            m_tree.expandPath(m_tree.getSelectionPath());
//			        	JOptionPane.showMessageDialog(null, jComboBox.getItemAt(0));
//			        	jComboBox.getItemAt(0);
			        	scan();


			        } else if (arg0.getSource() == stopItem) {
			        	JOptionPane.showMessageDialog(null, "test");
			        }
	        }
	   }
	}
	
	public void scan(){
		String scantype = "";

    	if(jCheckBoxMenuItem_re.isSelected()){
    		scantype = "re";
    	}else{
    		scantype = "";
    	}
    	if (filepath != "")
    	{
	    	FileScan filescan = new FileScan(filepath,(String)jComboBox.getItemAt(0),scantype);
	    	filescan.Scan();
	
	    	UpdateTable(FileReadAndUpateTable());
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Please select a file path or a file!");
    	}

	}

	public Vector FileReadAndUpateTable(){ 	    
	    String line = "";
	    int linenum = 0;

	    Vector rowdata = new Vector(2);
	    File f = new File("outfile.txt");

		BufferedReader br = null;
		defaultTable.vect.removeAllElements();
		try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "文件格式不符或未发现漏洞");
				e.printStackTrace();
			}        
		try {
				while ((line=br.readLine())!=null) {   
					if(line.equals("")){
						continue;
					}
					
					if(line.indexOf("文件")<0){			
						linenum++;
						rowdata.addElement(linenum);
						rowdata.addElement(line);											
							//刷新JTable							
//						System.out.println(line.trim());
					}
						
				}
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}        
		    try{
					br.close();
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}   

			return rowdata;
		}

	

}  //  @jve:decl-index=0:visual-constraint="10,10"


//使用AbstractTableModel接口实现数据表的操作
class DefaultTable extends AbstractTableModel{
	private String[] title = {"行数","程序代码"};
	public static final int[] COLUNM_WIDTHS = new int[] {//设置列宽度
        50, 1200
    };
	
	/*
//	private Object[][] Info = {{1,"phpinfo()"},{2,"<?php eval php>"}};
	private Object[][] Info = {};
	public int getColumnCount(){
		return this.title.length;
	}
	public int getRowCount(){
		return this.Info.length;
	}
	public Object getValueAt(int row,int col){
		return this.Info[row][col];
	}
	public String getColumnName(int col){
		return this.title[col];
	}
	public Class<?> getColumnClass(int col){
		return this.getValueAt(0, col).getClass();
	}
	public boolean isCellEditable(int cow,int col){
		return true;
	}
	public void setValueAt(Object newValue,int row,int col){
		this.Info[row][col]=newValue;		
		fireTableCellUpdated(row,col);
	}
*/
	Vector vect=new Vector(2);//实例化向量 
	public int getColumnCount(){ 
		return title.length;}//取得表格列数 
    public int getRowCount(){ 
		return vect.size();}//取得表格行数 
	public Object getValueAt(int row,int column){ 
		if(!vect.isEmpty()) 
		     return ((Vector)vect.elementAt(row)).elementAt(column); 
		else 
		     return null;}//取得单元格中的属性值 
	public String getColumnName(int column){ 
		return title[column];}//设置表格列名 
	public void setValueAt(Object value,int row,int column){} 
		//数据模型不可编辑，该方法设置为空 
	public Class getColumnClass(int c){ 
		return getValueAt(0,c).getClass(); 
		}//取得列所属对象类 
	public boolean isCellEditable(int row,int column){ 
		return false;}//设置单元格不可编辑，为缺省实现 
}



class IconCellRenderer extends JLabel implements TreeCellRenderer{
	protected Color m_textSelectionColor;
	protected Color m_textNonSelectionColor;
	protected Color m_bkSelectionColor;
	protected Color m_bkNonSelectionColor;
	protected Color m_borderSelectionColor;	
	protected boolean m_selected;
	
	public IconCellRenderer(){
	  super();
	  m_textSelectionColor = UIManager.getColor("Tree.selectionForeground");
	  m_textNonSelectionColor = UIManager.getColor("Tree.textForeground");
	  m_bkSelectionColor = UIManager.getColor("Tree.selectionBackground");
	  m_bkNonSelectionColor = UIManager.getColor("Tree.textBackground");
	  m_borderSelectionColor = UIManager.getColor("Tree.selectionBorderColor");
	  setOpaque(false);
	}

    public Component getTreeCellRendererComponent(JTree tree, 
           Object value, boolean sel, boolean expanded, boolean leaf, 
           int row, boolean hasFocus) {
	  DefaultMutableTreeNode node = (DefaultMutableTreeNode)value;
	  Object obj = node.getUserObject();
	  setText(obj.toString());	
	  
	  if (obj instanceof Boolean)
	     setText("Retrieving data...");
	
	  if (obj instanceof IconData){
		   IconData idata = (IconData)obj;
		   if (expanded)
		      setIcon(idata.getExpandedIcon());
		   else
		      setIcon(idata.getIcon());
	  }
	  else
	       setIcon(null);
	
	  setFont(tree.getFont());
	  setForeground(sel ? m_textSelectionColor : m_textNonSelectionColor);
	  setBackground(sel ? m_bkSelectionColor : m_bkNonSelectionColor);
	  m_selected = sel;
	  return this;
}
    

    public void paintComponent(Graphics g){
	  Color bColor = getBackground();
	  Icon icon = getIcon();	
	  g.setColor(bColor);
	  int offset = 0;
	  if(icon != null && getText() != null) 
	     offset = (icon.getIconWidth() + getIconTextGap());
	  g.fillRect(offset, 0, getWidth() - 1 - offset,getHeight() - 1);
	  
	  if (m_selected) {
		   g.setColor(m_borderSelectionColor);
		   g.drawRect(offset, 0, getWidth()-1-offset, getHeight()-1);
	  }
	  super.paintComponent(g);
    }
}

class IconData{
	protected Icon   m_icon;
	protected Icon   m_expandedIcon;
	protected Object m_data;

	public IconData(Icon icon, Object data){
	  m_icon = icon;
	  m_expandedIcon = null;
	  m_data = data;
	}

	public IconData(Icon icon, Icon expandedIcon, Object data){//构造函数的重载
	  m_icon = icon;
	  m_expandedIcon = expandedIcon;
	  m_data = data;
	}

	public Icon getIcon() { 
	  return m_icon;
	}

	public Icon getExpandedIcon() { 
	  return m_expandedIcon!=null ? m_expandedIcon : m_icon;
	}

	public Object getObject() { 
	  return m_data;
	}

	public String toString() { 
	  return m_data.toString();
	}
}

class FileNode
{
	protected File m_file;
	
	public FileNode(File file){
	  m_file = file;
	}

	public File getFile() { 
	  return m_file;
	}
	
	public String toString() { 
	  return m_file.getName().length() > 0 ? m_file.getName() : m_file.getPath();
	}
		
    
	public boolean expand(DefaultMutableTreeNode parent){		
	  DefaultMutableTreeNode flag = (DefaultMutableTreeNode)parent.getFirstChild();
	  if (flag==null)   // No flag 没有子节点，不需要扩展，返回false
	      return false;
	  Object obj = flag.getUserObject();
	  if (!(obj instanceof Boolean))
	      return false;      // Already expanded
	
	  parent.removeAllChildren();  // Remove Flag
	
	  File[] files = listFiles();
	  if (files == null)
	       return true;	
	  Vector v = new Vector();	
	  
	  for(int k=0; k<files.length; k++){
	     File f = files[k];
/*		 
		 if(!(f.isDirectory()))//是文件跳过循环
		      continue;
*/		
		 FileNode newNode = new FileNode(f);		   
		 boolean isAdded = false;		 
		 for(int  i = 0 ; i < v.size(); i++ ){
		    FileNode nd = (FileNode)v.elementAt(i);
		    if (newNode.compareTo(nd) < 0){//文件夹名不相同
		        v.insertElementAt(newNode, i);//vector中加文件
		        isAdded = true;
		        break;
		    }
		 }
		 if (!isAdded)//这里为了v初始化时，size()=0时调用
		    v.addElement(newNode);//加文件夹
      }
	
	  for (int i=0; i<v.size();i++){
	     FileNode nd = (FileNode)v.elementAt(i);//取一个文件夹
	     IconData idata = new IconData(null, null, nd);
	     DefaultMutableTreeNode node = new DefaultMutableTreeNode(idata);
	     parent.add(node);
	     	    
//	     if (nd.hasSubDirs())
	     if(nd.m_file.isDirectory())//如果是文件夹，添加子节点
	        node.add(new DefaultMutableTreeNode(new Boolean(true) ));//加一个节点的下面判断

	   }	
  
	  return true;
	}

	public boolean hasSubDirs(){
	  File[] files = listFiles();
	  if (files == null)
	      return false;//无文件
	  for (int k=0; k<files.length;k++){
	      if (files[k].isDirectory())//判断是否是文件夹
	         return true;
	  }
	  return false;
	}

	public int compareTo(FileNode toCompare){ //比较两个文件名
	   return  m_file.getName().compareToIgnoreCase(toCompare.m_file.getName()); 
	}

	protected File[] listFiles(){//列文件夹文件
	  if (!m_file.isDirectory())//如果不是文件夹返回null
	      return null;
	  try{
	      return m_file.listFiles();//如果是文件夹，递归调用
	  }catch (Exception ex){
		  JOptionPane.showMessageDialog(null, "Error reading directory "+m_file.getAbsolutePath(),
		    "Warning", JOptionPane.WARNING_MESSAGE);
		  return null;
	  }
	}
}


class FileScan{
	private File s_file;
    private Vector<File> v = new Vector<File>();//用于文件
	Vector vector = new Vector(2);//用于文件内容
	private Vector<String> vword = new Vector<String>();//用于存储特征
	private Vector<String> vnote = new Vector<String>();//用于存储备注
	Vector tablev = new Vector();//用于更新table
	private String scantype = "";//扫描类型，默认正则
	private String encoded = "GBK";
	private String filepath = "";

	FindTask1 findtask;
	

	public FileScan(String filepath){
		this.filepath = filepath;
	}
	public FileScan(String filepath,String encoded,String scantype){
		  s_file = new File(filepath);
		  this.encoded = encoded;
		  this.scantype = scantype;
//		  System.out.println(this.encoded);
	}

	public File getFile() { 
		  return s_file;
	}
	/*
	 * 获得文件列表，把结果放入vector变量
	 */
	public void Filelist(File file){
		File[] files = file.listFiles();
		
		for(int i=0;i<files.length;i++){
			if(files[i].isDirectory()){
				Filelist(files[i]);//递归调用
			}else{
				v.addElement(files[i]);
			}
		}
		
	}
	/*
	 * 读取目标文件内容，并将文件内容按照格式加入vector变量中，包括
	 * 行数
	 * 内容
	 */
	public void Fileread(){		
		String line = "";
		int codeId=1;
							
		File f = new File(filepath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		vector.removeAllElements();
										
		try {
			while ((line=br.readLine())!=null) {
				//每行显示加入vector中				
				vector.addElement(codeId);
				vector.addElement(line);							
				codeId++;
			}
			//for debug
			/*
			for(int i=0;i<vector.size();i+=2){
				System.out.println(vector.elementAt(i)+"//"+vector.elementAt(i+1));
			}
			*/			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        try {
			br.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	/*
	 * 读取两个配置文件，并添加进vector
	 */
	public void ReadConfig(){
		BufferedReader br = null;
		String word = "";
		final String repath = "regular_con.ini";//正则表达式配置文件路径
		final String keywordpath = "keyword_config.ini";//关键字配置文件路径
		
		String[] arrs = null;
		/*
		 *需要一种比较算法，使得扫描的速度和准确性高
		 * */
		{//判断扫描类型
			if(scantype.equals("re")){
				File fre = new File(repath);
				try {
					br = new BufferedReader(new FileReader(fre));//读取一个文件
				} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
					System.out.println("File re config not found");
					e.printStackTrace();
				}	
			}else{
				File fkw = new File(keywordpath);			
				try {
					br = new BufferedReader(new FileReader(fkw));//读取一个文件
				} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
					System.out.println("File kw config not found");
					e.printStackTrace();
				}	
			}
		}
		vword.removeAllElements();
		vnote.removeAllElements();
		try {
			while ((word=br.readLine())!=null) {//读取特征加入vector
				if(scantype.equals("re")){
					arrs = word.trim().split(" ");
					vword.addElement(arrs[0]);
					vnote.addElement(arrs[1]);
				}else{
					vword.addElement(word.trim());
				}
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        try {
			br.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		//for debug
/*		
		for(int j=0;j<vword.size();j++){
			System.out.println(vword.elementAt(j)+":"+vnote.elementAt(j));
			
		}
	*/	
	}
	public void Scan(){
//		BufferedReader fbr = null;
//		String code = "";	
		int threadnum = 10;//线程数
		ThreadPoolExecutor threadPool = null;//线程池句柄
		
		File outfile =new File("outfile.txt");
		
		if(outfile.exists()){
			outfile.delete();
		}

		/*
		 *需要一种比较算法，使得扫描的速度和准确性高，使用多线程？
		 * */		
		ReadConfig();
		
		v.removeAllElements();//首先清楚v中原有内容，防止重复扫描
		
		
		if(s_file.isDirectory()){
			Filelist(s_file);//如果是文件夹，将该路径下的所有文件添加到v中
		}
		v.addElement(s_file);
		System.out.println("main thread start!");
		//for debug 每个文件一个线程
		threadPool = new ThreadPoolExecutor(threadnum, threadnum * 2, 6,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1000),new ThreadPoolExecutor.DiscardOldestPolicy());
		for(int i=0;i<v.size();i++){//循环获得每个文件的file句柄
//			System.out.println(v.elementAt(i));
			if(v.elementAt(i).isDirectory())
				continue;
			if(v.elementAt(i).getName().toLowerCase().endsWith("php")){//只扫描php文件
				/*
		        for(int j=0;j<vword.size();j++){
		        	if(scantype.equals("re")){
		        		findtask = new FindTask(vword.elementAt(j),vnote.elementAt(j),v.elementAt(i),new File("out.txt"),encoded);
					    threadPool.execute(findtask);

						
		        	}else{
		        		findtask = new FindTask(vword.elementAt(j),null,v.elementAt(i),new File("out.txt"),encoded);
		        		threadPool.execute(findtask);
		        		
		        	}
				}
				*/
				if(scantype.equals("re")){
	        		findtask = new FindTask1(vword,vnote,v.elementAt(i),outfile,encoded);
				    threadPool.execute(findtask);

					
	        	}else{
	        		findtask = new FindTask1(vword,null,v.elementAt(i),outfile,encoded);
	        		threadPool.execute(findtask);
	        		
	        	}
			}
			
		}
		threadPool.shutdown(); //关闭后不能加入新线程，队列中的线程则依次执行完
		while(threadPool.getPoolSize()!=0);
		System.out.println("main thread end!");
		JOptionPane.showMessageDialog(null, "SCAN job is finished,now you can check out outfile.txt!");

	}
	
}


/**
 * 执行查找任务
 * 多线程
 */
class FindTask1 implements Runnable {   
    Vector<String> keyword = new Vector<String>();//关键字
    Vector<String> note = new Vector<String>();//配置文件regular_con.ini中的描述信息，正则扫描有描述信息
    File f = null;//输入文件
    File rs = null;//输出文件
    String encoded = "";//编码格式

/*
 * keyword: 关键字
 * note:    描述信息
 * f:		输入文件
 * rs:		输出文件
 * encoded:	文件的编码方式，建议使用utf-8
 */
    public FindTask1(Vector keyword, Vector note,File f, File rs,String encoded) {
        this.keyword = keyword;
        this.note = note;
        this.f = f;
        this.rs = rs;
        this.encoded = encoded;      
    }
    

    public void run() {
        boolean isfind = false;
        StringBuilder sb = new StringBuilder();
        sb.append("结果如下：").append('\r').append('\n');
        sb.append("在文件").append(f.getAbsolutePath()).append("找到以下内容:").append('\r').append('\n');
        String tmp = "";
        
    	if(rs.exists()){
    		rs.delete();
    	}
    		
        try {
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis,Charset.forName(encoded)); //以特定编码打开文本文件
            BufferedReader br = new BufferedReader(isr, 8192 * 8);
            String line = null;
            int linenum = 0;
//            System.out.println(sb);
            
            while ( (line = br.readLine()) != null) {//按行读取
                linenum++;
//                System.out.println(keyword);
                for(int i=0;i<keyword.size();i++){
	                Pattern pa = Pattern.compile(keyword.elementAt(i));
	                Matcher m = pa.matcher(line);
	                boolean isok = m.find();
	                if(isok){
	                	isfind = true;
	                	if(note!=null){
	                		
		                    sb.append(line+"  <第"+linenum+"行"+note.elementAt(i)).append(">").append('\r').append('\n');
	                	}
	                	else{
	                		
	                		sb.append(line+"  <第"+linenum+"行"+keyword.elementAt(i)).append(">").append('\r').append('\n');
	                	}
	                	
	                }
                }
            	            
            }
            if (isfind) {	        		
                RandomAccessFile rsf = new RandomAccessFile(rs, "rw");
                FileChannel fc = rsf.getChannel();
                fc.force(true);
                FileLock fl = fc.lock();                

                ByteBuffer bb = ByteBuffer.allocate(sb.length()*2);
               
                bb.put(sb.toString().getBytes());
                bb.flip();
                fc.write(bb, rsf.length());
                fl.release();
                fc.close();
                rsf.close();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   
}


/**
 * 执行查找任务
 * 多线程
 */
class FindTask implements Runnable {   
    String keyword = "";//关键字
    String note = "";//描述
    File f = null;//输入文件
    File rs = null;//输出文件
    String encoded = "";//编码格式
      
    public FindTask(){
    	
    }
    
    public FindTask(String keyword, String note,File f, File rs,String encoded) {
        this.keyword = keyword;
        this.note = note;
        this.f = f;
        this.rs = rs;
        this.encoded = encoded;      
    }
    

    public void run() {
        boolean isfind = false;
        StringBuilder sb = new StringBuilder();
        sb.append("").append('\r').append('\n');
        sb.append("在文件").append(f.getAbsolutePath()).append("找到以下内容:").append('\r').append('\n');
        try {
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis,Charset.forName(encoded)); //以特定编码打开文本文件
            BufferedReader br = new BufferedReader(isr, 8192 * 8);
            String line = null;
            int linenum = 0;
//            System.out.println(sb);
            
            while ( (line = br.readLine()) != null) {//按行读取
                linenum++;
//                System.out.println(keyword);
                Pattern pa = Pattern.compile(keyword);
                Matcher m = pa.matcher(line);
                boolean isok = m.find();
                if(isok){
                	isfind = true;
	                sb.append("第"+linenum+"行"+note).append('\r').append('\n');
                }
                /*
               if(isok){
//                if (line.indexOf(keyword) >= 0) {
                    //查找符合条件的字符串
//                    isfind = findString(sb,line,linenum);              	
//                	System.out.println(f.getAbsolutePath()+"第"+linenum+"行"+note+line);
            	   synchronized(this){
            	   tablev.addElement(linenum);
            	   tablev.addElement(line+" 在"+f.getAbsoluteFile()+"第"+linenum+"行"+note);  
            	   }
//               	tableupdate.tablev.addElement(linenum);
//               	tableupdate.tablev.addElement(line+" 在"+f.getAbsoluteFile()+"第"+linenum+"行"+note); 
                }
            }
            */
            	            
            }
            if (isfind) {
                RandomAccessFile rsf = new RandomAccessFile(rs, "rw");
                FileChannel fc = rsf.getChannel();
                fc.force(true);
                FileLock fl = fc.lock();                

                ByteBuffer bb = ByteBuffer.allocate(sb.length()*2);
               
                bb.put(sb.toString().getBytes());
                bb.flip();
                fc.write(bb, rsf.length());
                fl.release();
                fc.close();
                rsf.close();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(ve.size());
//        for(int i=0;i<ve.size();i++)
//        	System.out.println(ve.elementAt(i));
    }
    
    private boolean findString(StringBuilder sb,String line,int linenum) {
    	/*
        boolean isfind = false;
        if(line != null && !line.equals("")) {
            if ((line.indexOf("Messages.getString") < 0) ) {
                //截取"("之后的字符串
                if (line.indexOf("(") >= 0 && line.indexOf(")") >= 0) {
                    String str1 = line.substring(line.indexOf("("),line.indexOf(")"));
                    if (str1.indexOf("\"") >= 0 && str1.lastIndexOf("\"") >0 
                            && str1.lastIndexOf("\"") > str1.indexOf("\"")) {
                        String str2 = str1.substring(str1.indexOf("\"")+1, str1.lastIndexOf("\""));
                        if (!str2.equals("") && (str2.indexOf(".") <0) ) {
                            //判断字符串中含有中文字符串
                            Pattern   pa   =   Pattern.compile("[\u4E00-\u9FA0]");
                            Matcher   m   =   pa.matcher(str2);
                            boolean isok = m.find();
                            if(isok) {
                                isfind = true;
                                sb.append('第').append(linenum).append("行: ");
                                sb.append(line).append('\r').append('\n');
                            }
                        }
                    }
                }
            }
        }
        return isfind;
         */
    	return false;
    }
   
}
