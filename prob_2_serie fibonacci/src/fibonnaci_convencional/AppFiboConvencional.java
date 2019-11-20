package fibonnaci_convencional;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AppFiboConvencional extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInsiraNumero1;
	private JTextField textField_ResultTemp;
	private JTextField textField_ResultFibo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFiboConvencional frame = new AppFiboConvencional();
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
	public AppFiboConvencional() {
		setTitle("Problema - 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblInfoCalculo = new JLabel("Calculando a série de Fibonacci");
		lblInfoCalculo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInfoCalculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoCalculo.setBounds(10, 11, 308, 20);
		contentPane.add(lblInfoCalculo);

		JLabel lblinfoCalculo_2 = new JLabel("m\u00E9todo recursivo tradicional.");
		lblinfoCalculo_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinfoCalculo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfoCalculo_2.setBounds(10, 40, 308, 20);
		contentPane.add(lblinfoCalculo_2);

		JLabel lblRepeticao = new JLabel("Número de Repetições:");
		lblRepeticao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRepeticao.setBounds(10, 87, 150, 25);
		contentPane.add(lblRepeticao);

		JLabel lblNewLabel = new JLabel("Entrada:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 123, 89, 20);
		contentPane.add(lblNewLabel);

		txtInsiraNumero1 = new JTextField();
		txtInsiraNumero1.setBounds(190, 123, 123, 23);
		contentPane.add(txtInsiraNumero1);
		txtInsiraNumero1.setColumns(10);

		JLabel lblTempoPercorridoEm = new JLabel("Tempo percorrido em milissegundos:");
		lblTempoPercorridoEm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTempoPercorridoEm.setBounds(10, 185, 248, 29);
		contentPane.add(lblTempoPercorridoEm);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResultado.setBounds(10, 225, 81, 14);
		contentPane.add(lblResultado);

		textField_ResultTemp = new JTextField();
		textField_ResultTemp.setEditable(false);
		textField_ResultTemp.setBounds(190, 225, 123, 20);
		contentPane.add(textField_ResultTemp);
		textField_ResultTemp.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(5, 157, 81, 20);
		contentPane.add(lblNewLabel_1);

		textField_ResultFibo = new JTextField();
		textField_ResultFibo.setEditable(false);
		textField_ResultFibo.setBounds(101, 157, 212, 20);
		contentPane.add(textField_ResultFibo);
		textField_ResultFibo.setColumns(10);

		FiboConvencional fc = new FiboConvencional();

		JButton btnCalcularC = new JButton("Calcular - C");
		btnCalcularC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				long result = 0;
				int i = Integer.parseInt(txtInsiraNumero1.getText());
				int r = Integer.parseInt(textField.getText());
				Instant tempoInicial = Instant.now(); // Capturando tempo inicial
				for (int j = 0; j < r; j++) {

					result = fc.fibonacci(i);
				}
				Instant tempoFinal = Instant.now(); // Capturando tempo Final
				
				String resultadoFibConv = String.valueOf(result);
				textField_ResultFibo.setText(resultadoFibConv);
				
				double tempoDurancao = Duration.between(tempoInicial, tempoFinal).toMillis();
				
				String tempoExe = String.valueOf(tempoDurancao);
				textField_ResultTemp.setText(tempoExe);
			}
		});
		btnCalcularC.setBounds(211, 265, 102, 23);
		contentPane.add(btnCalcularC);

		JButton btnLimapr = new JButton("Limpar");
		btnLimapr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_ResultFibo.setText("");
				textField_ResultTemp.setText("");
				txtInsiraNumero1.setText("");
			}
		});
		btnLimapr.setBounds(30, 265, 102, 23);
		contentPane.add(btnLimapr);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(190, 90, 123, 23);
		contentPane.add(textField);

	}
}
