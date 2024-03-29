package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.HospedeDao;
import dao.ReservaDao;
import modelo.Hospede;
import modelo.Reserva;
import util.JPAUtil;

@SuppressWarnings("serial")
public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTable tbHospedes;
	private JTable tbReservas;
	private DefaultTableModel modelo;
	private DefaultTableModel modeloHospedes;
	private JLabel labelAtras;
	private JLabel labelExit;
	int xMouse, yMouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar frame = new Buscar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Buscar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Buscar.class.getResource("/imagenes/lOGO-50PX.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 571);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);

		txtBuscar = new JTextField();
		txtBuscar.setBounds(536, 127, 193, 31);
		txtBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);

		JLabel lblTitulo = new JLabel("SISTEMA DE BUSCA");
		lblTitulo.setForeground(new Color(12, 138, 199));
		lblTitulo.setFont(new Font("Roboto Black", Font.BOLD, 24));
		lblTitulo.setBounds(331, 62, 280, 42);
		contentPane.add(lblTitulo);

		JTabbedPane panel = new JTabbedPane(JTabbedPane.TOP);
		panel.setBackground(new Color(12, 138, 199));
		panel.setFont(new Font("Roboto", Font.PLAIN, 16));
		panel.setBounds(20, 169, 865, 328);
		contentPane.add(panel);

		tbReservas = new JTable();
		tbReservas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbReservas.setFont(new Font("Roboto", Font.PLAIN, 16));
		modelo = (DefaultTableModel) tbReservas.getModel();
		modelo.addColumn("Numero de Reserva");
		modelo.addColumn("Data Check In");
		modelo.addColumn("Data Check Out");
		modelo.addColumn("Valor");
		modelo.addColumn("Forma de Pago");
		JScrollPane scroll_table = new JScrollPane(tbReservas);
		panel.addTab("Reservas", new ImageIcon(Buscar.class.getResource("/imagenes/reservado.png")), scroll_table,
				null);
		scroll_table.setVisible(true);

		tbHospedes = new JTable();
		tbHospedes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbHospedes.setFont(new Font("Roboto", Font.PLAIN, 16));
		modeloHospedes = (DefaultTableModel) tbHospedes.getModel();
		modeloHospedes.addColumn("Numero de Hóspede");
		modeloHospedes.addColumn("Nome");
		modeloHospedes.addColumn("Sobrenome");
		modeloHospedes.addColumn("Data de Nascimento");
		modeloHospedes.addColumn("Nacionalidade");
		modeloHospedes.addColumn("Telefone");
		modeloHospedes.addColumn("Numero de Reserva");
		JScrollPane scroll_tableHuespedes = new JScrollPane(tbHospedes);
		panel.addTab("Hóspedes", new ImageIcon(Buscar.class.getResource("/imagenes/pessoas.png")),
				scroll_tableHuespedes, null);
		scroll_tableHuespedes.setVisible(true);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Buscar.class.getResource("/imagenes/Ha-100px.png")));
		lblNewLabel_2.setBounds(56, 51, 104, 107);
		contentPane.add(lblNewLabel_2);

		JPanel header = new JPanel();
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				headerMouseDragged(e);

			}
		});
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				headerMousePressed(e);
			}
		});
		header.setLayout(null);
		header.setBackground(Color.WHITE);
		header.setBounds(0, 0, 910, 36);
		contentPane.add(header);

		JPanel btnAtras = new JPanel();
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuUsuario usuario = new MenuUsuario();
				usuario.setVisible(true);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnAtras.setBackground(new Color(12, 138, 199));
				labelAtras.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAtras.setBackground(Color.white);
				labelAtras.setForeground(Color.black);
			}
		});
		btnAtras.setLayout(null);
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(0, 0, 53, 36);
		header.add(btnAtras);

		labelAtras = new JLabel("<");
		labelAtras.setHorizontalAlignment(SwingConstants.CENTER);
		labelAtras.setFont(new Font("Roboto", Font.PLAIN, 23));
		labelAtras.setBounds(0, 0, 53, 36);
		btnAtras.add(labelAtras);

		JPanel btnexit = new JPanel();
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuUsuario usuario = new MenuUsuario();
				usuario.setVisible(true);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) { // Quando o usuário passa o mouse sobre o botão, ele muda de cor
				btnexit.setBackground(Color.red);
				labelExit.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) { // Quando o usuário remove o mouse do botão, ele retornará ao estado
													// original
				btnexit.setBackground(Color.white);
				labelExit.setForeground(Color.black);
			}
		});
		btnexit.setLayout(null);
		btnexit.setBackground(Color.WHITE);
		btnexit.setBounds(857, 0, 53, 36);
		header.add(btnexit);

		labelExit = new JLabel("X");
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);
		labelExit.setForeground(Color.BLACK);
		labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelExit.setBounds(0, 0, 53, 36);
		btnexit.add(labelExit);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(12, 138, 199));
		separator_1_2.setBackground(new Color(12, 138, 199));
		separator_1_2.setBounds(539, 159, 193, 2);
		contentPane.add(separator_1_2);

		JPanel btnbuscar = new JPanel();
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String busca = txtBuscar.getText();

				EntityManager em = JPAUtil.getEntityManager();
				HospedeDao hospedeDao = new HospedeDao(em);

				if (hospedeDao.isNumero(busca)) {
					Long idBusca = Long.valueOf(busca);

					if (hospedeDao.verificarExistenciaIdReserva(idBusca)) {
						Hospede hospede = hospedeDao.buscarPorIdDaReserva(idBusca);

						Object[] rowData1 = new Object[7];

						rowData1[0] = hospede.getId();
						rowData1[1] = hospede.getNome();
						rowData1[2] = hospede.getSobrenome();
						rowData1[3] = hospede.getDataNascimento();
						rowData1[4] = hospede.getNascionalidade();
						rowData1[5] = hospede.getTelefone();
						rowData1[6] = hospede.getReserva().getId();

						modeloHospedes.addRow(rowData1);

						Object[] rowData = new Object[5];

						rowData[0] = hospede.getReserva().getId();
						rowData[1] = hospede.getReserva().getDataEntrada();
						rowData[2] = hospede.getReserva().getDataSaida();
						rowData[3] = hospede.getReserva().getValorTotalReserva();
						rowData[4] = hospede.getReserva().getFormaDePagamento();

						modelo.addRow(rowData);
					} else {
						JOptionPane.showMessageDialog(null, "Id da Reserva não existe no Banco de dados");
					}

				} else {

					if (hospedeDao.verificarExistenciaNome(busca)) {
						Hospede hospede = hospedeDao.buscarPorNome(busca);

						Object[] rowData1 = new Object[7];

						rowData1[0] = hospede.getId();
						rowData1[1] = hospede.getNome();
						rowData1[2] = hospede.getSobrenome();
						rowData1[3] = hospede.getDataNascimento();
						rowData1[4] = hospede.getNascionalidade();
						rowData1[5] = hospede.getTelefone();
						rowData1[6] = hospede.getReserva().getId();

						modeloHospedes.addRow(rowData1);

						Object[] rowData = new Object[5];

						rowData[0] = hospede.getReserva().getId();
						rowData[1] = hospede.getReserva().getDataEntrada();
						rowData[2] = hospede.getReserva().getDataSaida();
						rowData[3] = hospede.getReserva().getValorTotalReserva();
						rowData[4] = hospede.getReserva().getFormaDePagamento();

						modelo.addRow(rowData);
					} else {
						JOptionPane.showMessageDialog(null, "Nome do Hospede não existe no Banco de Dados");
					}

				}
				JOptionPane.showMessageDialog(null,
						"Selecione uma reserva para editar ou deletar, e click no botão de ação desejado. Lembre-se de estar com a linha desejada selecionada!");
			}
		});
		btnbuscar.setLayout(null);
		btnbuscar.setBackground(new Color(12, 138, 199));
		btnbuscar.setBounds(748, 125, 122, 35);
		btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		contentPane.add(btnbuscar);

		JLabel lblBuscar = new JLabel("BUSCAR");
		lblBuscar.setBounds(0, 0, 122, 35);
		btnbuscar.add(lblBuscar);
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setFont(new Font("Roboto", Font.PLAIN, 18));

		// Ajustar os métodos para pegar os tipos LocalDate
		JPanel btnEditar = new JPanel();
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tbHospedes.getSelectedRow();
				if (selectedRow != -1) {
					Long hospedeId = (Long) modeloHospedes.getValueAt(selectedRow, 0); // O ID da reserva esteja na
																						// coluna-0

					EntityManager em = JPAUtil.getEntityManager();
					Hospede hospede = em.find(Hospede.class, hospedeId);

					// Atualizar os campos modificados com os novos valores
					hospede.setNome((String) modeloHospedes.getValueAt(selectedRow, 1));
					hospede.setSobrenome((String) modeloHospedes.getValueAt(selectedRow, 2));
//					hospede.setDataNascimento(((LocalDate) modelo.getValueAt(selectedRow, 3))); //Precisa ajustar esse retorno!!
					hospede.setNascionalidade((String) modeloHospedes.getValueAt(selectedRow, 4));
					hospede.setTelefone((String) modeloHospedes.getValueAt(selectedRow, 5));

//					hospede.getReserva().setDataEntrada(((LocalDate) modelo.getValueAt(selectedRow, 1))); //Precisa ajustar esse retorno!!
//					hospede.getReserva().setDataSaida(((LocalDate) modelo.getValueAt(selectedRow, 2)));//Precisa ajustar esse retorno!!
					hospede.getReserva().setFormaDePagamento((String) modelo.getValueAt(selectedRow, 4));

					HospedeDao hospedeDao = new HospedeDao(em);
					hospedeDao.editarHospede(hospede);

				} else {
					JOptionPane.showMessageDialog(null, "Nenhuma Reserva Selecionada");
				}
			}
		});

		btnEditar.setLayout(null);
		btnEditar.setBackground(new Color(12, 138, 199));
		btnEditar.setBounds(635, 508, 122, 35);
		btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		contentPane.add(btnEditar);

		JLabel lblEditar = new JLabel("EDITAR");
		lblEditar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditar.setForeground(Color.WHITE);
		lblEditar.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblEditar.setBounds(0, 0, 122, 35);
		btnEditar.add(lblEditar);

		// Jogar para a Dao - > DELETAR
		JPanel btnDeletar = new JPanel();
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tbReservas.getSelectedRow();
				if (selectedRow != -1) {
					Long reservaId = (Long) modelo.getValueAt(selectedRow, 0); // Supondo que o ID da reserva esteja na
																				// coluna 0

					EntityManager em = JPAUtil.getEntityManager();
					Reserva reserva = em.find(Reserva.class, reservaId);
					ReservaDao reservaDao = new ReservaDao(em);

					HospedeDao hospedeDao = new HospedeDao(em);
					Hospede hospede = hospedeDao.buscarPorIdDaReserva(reservaId);

					hospedeDao.deletarHospede(hospede);
					reservaDao.deletarReserva(reserva);

//					try {
//						em.getTransaction().begin();
//						em.remove(hospede);
//						em.remove(reserva); 
//						em.getTransaction().commit();
//
//						// Remover a linha da tabela
//						modelo.removeRow(selectedRow);
//
//						JOptionPane.showMessageDialog(null, "A reserva foi deletada com sucesso.", "Reserva Deletada",
//								JOptionPane.INFORMATION_MESSAGE);
//					} catch (Exception ex) {
//						em.getTransaction().rollback();
//						JOptionPane.showMessageDialog(null, "Erro ao deletar a reserva: " + ex.getMessage(), "Erro",
//								JOptionPane.ERROR_MESSAGE);
//					} finally {
//						em.close();
//					}

				} else {
					JOptionPane.showMessageDialog(null, "Nenhuma Reserva Selecionada");
				}
			}

		});
		btnDeletar.setLayout(null);
		btnDeletar.setBackground(new Color(12, 138, 199));
		btnDeletar.setBounds(767, 508, 122, 35);
		btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		contentPane.add(btnDeletar);

		JLabel lblExcluir = new JLabel("DELETAR");
		lblExcluir.setHorizontalAlignment(SwingConstants.CENTER);
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblExcluir.setBounds(0, 0, 122, 35);
		btnDeletar.add(lblExcluir);
		setResizable(false);
	}

	// Código que permite movimentar a janela pela tela seguindo a posição de "x" e
	// "y"
	private void headerMousePressed(java.awt.event.MouseEvent evt) {
		xMouse = evt.getX();
		yMouse = evt.getY();
	}

	private void headerMouseDragged(java.awt.event.MouseEvent evt) {
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xMouse, y - yMouse);
	}
}
