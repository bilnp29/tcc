package fatorial_Lambda;

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

public class AppFatorialLambda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtField_repeticoes;
	private JTextField txtField_Result;
	private JTextField txtFiledResultTempo;
	private JTextField textFieldEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFatorialLambda frame = new AppFatorialLambda();
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
	public AppFatorialLambda() {
		setTitle("Problema 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Fatorial Interativo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(5, 11, 314, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E9todo Expressões Lambdas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(5, 47, 314, 25);
		contentPane.add(lblNewLabel_1);

		JLabel lblRepeticao = new JLabel("Número de Repetições:");
		lblRepeticao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRepeticao.setBounds(5, 87, 150, 25);
		contentPane.add(lblRepeticao);

		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(5, 156, 93, 25);
		contentPane.add(lblNewLabel_2);

		JLabel lblTempoPercorridoEm = new JLabel("Tempo percorrido em milissegundos:");
		lblTempoPercorridoEm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTempoPercorridoEm.setBounds(5, 181, 248, 29);
		contentPane.add(lblTempoPercorridoEm);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResultado.setBounds(5, 221, 81, 14);
		contentPane.add(lblResultado);

		txtField_repeticoes = new JTextField();
		txtField_repeticoes.setBounds(159, 89, 160, 22);
		contentPane.add(txtField_repeticoes);

		txtField_Result = new JTextField();
		txtField_Result.setEditable(false);
		txtField_Result.setBounds(159, 158, 160, 22);
		contentPane.add(txtField_Result);
		txtField_Result.setColumns(10);

		txtFiledResultTempo = new JTextField();
		txtFiledResultTempo.setEditable(false);
		txtFiledResultTempo.setBounds(160, 219, 103, 20);
		contentPane.add(txtFiledResultTempo);
		txtFiledResultTempo.setColumns(10);

		FatorialLambda fl = new FatorialLambda();

		JButton btnExecutarl = new JButton("Executar- L");
		btnExecutarl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long result = 0;
				int i = Integer.parseInt(textFieldEntrada.getText());
				int n = Integer.parseInt(txtField_repeticoes.getText());
				
				Instant tempoInicial = Instant.now(); // Capturando tempo inicial
				for (int j = 0; j < n; j++) {
					
					result = fl.fatLambda(i);		// Método chamado
				}
				Instant tempoFinal = Instant.now(); // Capturando tempo Final

				String resultadoFibLambda = String.valueOf(result);
				txtField_Result.setText(resultadoFibLambda);

				double tempoDurancao = Duration.between(tempoInicial, tempoFinal).toMillis(); // Tempo pecorrido.
				
				String tempoExe = String.valueOf(tempoDurancao);
				txtFiledResultTempo.setText(tempoExe);

			}
		});
		btnExecutarl.setBounds(189, 270, 100, 23);
		contentPane.add(btnExecutarl);

		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textFieldEntrada.setText("");
				txtField_repeticoes.setText("");
				txtField_Result.setText("");
				txtFiledResultTempo.setText("");

			}
		});
		btnlimpar.setBounds(50, 270, 100, 23);
		contentPane.add(btnlimpar);

		JLabel lblNewLabel_3 = new JLabel("Entrada:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(5, 119, 93, 25);
		contentPane.add(lblNewLabel_3);

		textFieldEntrada = new JTextField();
		textFieldEntrada.setBounds(159, 121, 160, 22);
		contentPane.add(textFieldEntrada);
		textFieldEntrada.setColumns(10);
	}

}
