package gui;

import clase.Producto;
import arreglo.ArregloProductos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejemplo extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JTextField txtProducto;
	private JTextField txtPrecio;	
	private JTextField txtCantidad;
	private JButton btnAdicionar;	
	private JButton btnReportar;
	private JScrollPane scrollPaneA;
	private JScrollPane scrollPaneB;
	private JTextArea txtS;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo() {
		setTitle("FACTURA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Producto");
		lblNombre.setBounds(10, 178, 68, 28);
		contentPane.add(lblNombre);
		
		lblNota1 = new JLabel("Precio");
		lblNota1.setBounds(162, 178, 58, 28);
		contentPane.add(lblNota1);	
		
		lblNota2 = new JLabel("Cantidad");
		lblNota2.setBounds(290, 178, 58, 28);
		contentPane.add(lblNota2);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(90, 178, 60, 28);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(213, 178, 40, 28);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(351, 178, 40, 28);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(438, 181, 155, 23);
		btnAdicionar.addActionListener(this);
		contentPane.add(btnAdicionar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.setBounds(615, 181, 155, 23);
		btnReportar.addActionListener(this);
		contentPane.add(btnReportar);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(10, 219, 778, 145);
		contentPane.add(scrollPaneA);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPaneA.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("nombre");
		modelo.addColumn("precio");
		modelo.addColumn("cantidad");
		modelo.addColumn("subtotal");
		modelo.addColumn("IGV");
		tblTabla.setModel(modelo);

		scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(10, 366, 778, 237);
		contentPane.add(scrollPaneB);
		
		txtS = new JTextArea();
		txtS.setTabSize(0);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPaneB.setViewportView(txtS);
		
		lblBodegaRositaEirl = new JLabel("BODEGA ROSITA E.I.R.L. ");
		lblBodegaRositaEirl.setBounds(74, 13, 162, 16);
		contentPane.add(lblBodegaRositaEirl);
		
		lblNewLabel = new JLabel("Av. Morales Duarez Mz A lt 14 Santa Rosa - Callao");
		lblNewLabel.setBounds(10, 42, 305, 16);
		contentPane.add(lblNewLabel);
		
		lblFacturaElectrnica = new JLabel("FACTURA ELECTR\u00D3NICA");
		lblFacturaElectrnica.setBounds(602, 13, 148, 16);
		contentPane.add(lblFacturaElectrnica);
		
		lblNewLabel_1 = new JLabel("RUC: 502837482");
		lblNewLabel_1.setBounds(625, 29, 102, 16);
		contentPane.add(lblNewLabel_1);
		
		lblFecha = new JLabel("Fecha: 27-05-23");
		lblFecha.setBounds(625, 42, 108, 16);
		contentPane.add(lblFecha);
		
		lblNombreDelCliente = new JLabel("Nombre del cliente:");
		lblNombreDelCliente.setBounds(234, 88, 120, 16);
		contentPane.add(lblNombreDelCliente);
		
		textField = new JTextField();
		textField.setBounds(357, 85, 431, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(10, 138, 56, 16);
		contentPane.add(lblDireccin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 135, 710, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblRucCliente = new JLabel("RUC cliente:");
		lblRucCliente.setBounds(10, 88, 81, 16);
		contentPane.add(lblRucCliente);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 85, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		listar();		
	}
	
	//  Declaración global
	ArregloProductos aa = new ArregloProductos();
	private JLabel lblBodegaRositaEirl;
	private JLabel lblNewLabel;
	private JLabel lblFacturaElectrnica;
	private JLabel lblNewLabel_1;
	private JLabel lblFecha;
	private JLabel lblNombreDelCliente;
	private JTextField textField;
	private JLabel lblDireccin;
	private JTextField textField_1;
	private JLabel lblRucCliente;
	private JTextField textField_2;

	/** 
	 *           .-------.
     *  .-------.| 456   |
     *  |  123  || Juan  |.-------.
     *  |  Ana  || 15    || 789   |.-------.
     *  |  19   || 14    || Pedro || 302   |
     *  |  15   |'-------'| 17    || David |
     *  '-------'   |     | 19    || 13    |
     *      |        \    '-------'| 18    |
     *      \         |      /     '-------'
     *       \        |     /          /
     *        \ _     |    /    _ _ _ /
     *            \   |   |   / 
     *          .---.---.---.---.---.---.---.---.---.---.
     *     ==>  | @ | @ | @ | @ |   |   |   |   |   |   |
     *          '---'---'---'---'---'---'---'---'---'---'
     *            0   1   2   3   4   5   6   7   8   9
     * 							  ^                 
	 */
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		/**
		 * Envía al método adicionar un nuevo alumno creado
		 */	
		String nombre = leerNombre();
		float precio = leerPrecio();
		int producto = leerCantidad();
		Producto nuevo = new Producto(nombre, precio, producto);
		aa.adicionar(nuevo);
		listar();
		limpieza();
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		/**
		 * Muestra la cantidad de alumnos, promedio general
		 * de todos los alumnos y nombre del alumno con el
		 * mayor promedio
		 */
		txtS.setText("");
		imprimir("                                                       cantidad de Productos ingresados :" + aa.tamanio());
		imprimir("                                                                               Subtotal :" + aa.total());
		imprimir("                                                                                    IGV :" + aa.igvTotal());
		imprimir("                                                                                   TOTAL:" + aa.totalidad());
  	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtProducto.setText("");
		txtPrecio.setText("");
		txtCantidad.setText("");
		txtS.setText("");
	}
   	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<aa.tamanio(); i++) {
			Object[] fila = { aa.obtener(i).getNombre(),
					          aa.obtener(i).getprecio(),
					          aa.obtener(i).getcantidad(),
					          aa.obtener(i).subtotal(),
					          aa.obtener(i).igv(),};
			modelo.addRow(fila);
		}
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}		
	//  Métodos que retornan valor (sin parámetros)
	
	String leerNombre() {
		return txtProducto.getText().trim();
	}
	float leerPrecio() {
		return Float.parseFloat(txtPrecio.getText().trim());
	}
	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText().trim());
	}
}
