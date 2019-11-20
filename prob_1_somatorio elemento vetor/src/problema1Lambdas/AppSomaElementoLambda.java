package problema1Lambdas;

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

public class AppSomaElementoLambda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtField_Result;
	private JTextField txtField_repeticoes;
	private JTextField txtFiledResultTempoSoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppSomaElementoLambda frame = new AppSomaElementoLambda();
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
	public AppSomaElementoLambda() {
		setTitle("Problema 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Soma dos elementos de um vetor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(5, 11, 314, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E9todo Express\u00F5es Lambdas");
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
		lblNewLabel_2.setBounds(5, 123, 93, 25);
		contentPane.add(lblNewLabel_2);

		JLabel lblTempoPercorridoEm = new JLabel("Tempo percorrido em milissegundos:");
		lblTempoPercorridoEm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTempoPercorridoEm.setBounds(5, 170, 248, 29);
		contentPane.add(lblTempoPercorridoEm);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResultado.setBounds(5, 200, 81, 14);
		contentPane.add(lblResultado);

		txtField_repeticoes = new JTextField();
		txtField_repeticoes.setBounds(160, 89, 160, 22);
		contentPane.add(txtField_repeticoes);

		txtField_Result = new JTextField();
		txtField_Result.setEditable(false);
		txtField_Result.setBounds(160, 126, 160, 22);
		contentPane.add(txtField_Result);
		txtField_Result.setColumns(10);

		txtFiledResultTempoSoma = new JTextField();
		txtFiledResultTempoSoma.setEditable(false);
		txtFiledResultTempoSoma.setBounds(160, 205, 103, 20);
		contentPane.add(txtFiledResultTempoSoma);
		txtFiledResultTempoSoma.setColumns(10);

		SomatorioLambda sv = new SomatorioLambda();

		JButton btnExecutarl = new JButton("Executar- L");
		btnExecutarl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				int n = Integer.parseInt(txtField_repeticoes.getText());

				Instant tempoInicial = Instant.now(); // Capturando tempo inicial
				for (int i = 0; i < n; i++) {
					result = sv.somarElementosLambdas(); // Chamada ao método
				}
				Instant tempoFinal = Instant.now(); // Capturando tempo Final

				long tempoDurancao = Duration.between(tempoInicial, tempoFinal).toMillis();

				String resultadoSomaLambda = String.valueOf(result);
				txtField_Result.setText(resultadoSomaLambda);
				
				String tempoExe = String.valueOf(tempoDurancao);
				txtFiledResultTempoSoma.setText(tempoExe);

			}
		});
		btnExecutarl.setBounds(189, 270, 100, 23);
		contentPane.add(btnExecutarl);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtField_repeticoes.setText("");
				txtField_Result.setText("");
				txtFiledResultTempoSoma.setText("");
				
			}
		});		
		btnlimpar.setBounds(50, 270, 100, 23);
		contentPane.add(btnlimpar);
	}

}
