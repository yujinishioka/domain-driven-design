package br.com.yuji.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class DialogGerarNumero extends JDialog {
	private JLabel lbNumeroMaximo;
	private JButton btGerar;
	private JButton btGerarOrdenar;
	private JSlider slNumeroMaximo;
	
	public DialogGerarNumero() {
		this.setSize(300, 205);
		this.setLocationRelativeTo(null);
		this.setTitle("Gerar numero randomico");
		this.setModal(true);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		this.lbNumeroMaximo = new JLabel("Numero maximo");
		
		this.slNumeroMaximo = new JSlider(1, 99999);
		this.slNumeroMaximo.setMajorTickSpacing(99999);
		this.slNumeroMaximo.setPaintTicks(true);
		
		this.btGerar = new JButton("Gerar numero");
		this.btGerarOrdenar = new JButton("Gerar e Ordenar");
		
		this.lbNumeroMaximo.setBounds(20, 20, 200, 20);
		this.slNumeroMaximo.setBounds(20, 50, 245, 30);
		this.btGerar.setBounds(70, 90, 150, 25);
		this.btGerarOrdenar.setBounds(70, 125, 150, 25);
		
		this.add(lbNumeroMaximo);
		this.add(slNumeroMaximo);
		this.add(btGerar);
		this.add(btGerarOrdenar);
	}

	public JLabel getLbNumeroMaximo() {
		return lbNumeroMaximo;
	}

	public void setLbNumeroMaximo(JLabel lbNumeroMaximo) {
		this.lbNumeroMaximo = lbNumeroMaximo;
	}

	public JButton getBtGerar() {
		return btGerar;
	}

	public void setBtGerar(JButton btGerar) {
		this.btGerar = btGerar;
	}

	public JButton getBtGerarOrdenar() {
		return btGerarOrdenar;
	}

	public void setBtGerarOrdenar(JButton btGerarOrdenar) {
		this.btGerarOrdenar = btGerarOrdenar;
	}

	public JSlider getSlNumeroMaximo() {
		return slNumeroMaximo;
	}

	public void setSlNumeroMaximo(JSlider slNumeroMaximo) {
		this.slNumeroMaximo = slNumeroMaximo;
	}
	
	public static void main(String[] args) {
		DialogGerarNumero dgn = new DialogGerarNumero();
	}
}
