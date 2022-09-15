package aula15;

public class ModeloTV01 extends TV implements ControleRemoto {
	
	private final String msgD = "TV Desligada.";
	
	public ModeloTV01(int t) {
		super(t);
	}

	@Override
	public void ligarTV() {
		this.setLigada(true);
	}

	@Override
	public void desligarTV() {
		this.setLigada(false);
	}

	@Override
	public void mudarCanal(int canal) {
		if(this.isLigada()) {
			if(canal > 0 && canal <= 100) {
				this.setCanal(canal);
			} else {
				System.out.println("Impossivel mudar de canal.");
			}
		} else {
			System.out.println(msgD);
		}
	}

	@Override
	public void aumentarCanal() {
		if(this.isLigada()) {
			if(this.getCanal() == 100) {
				setCanal(1);
			} else {
				setCanal(getCanal() + 1);
			}
		} else {
			System.out.println(msgD);
		}
	}

	@Override
	public void diminuirCanal() {
		if(this.isLigada()) {
			if(this.getCanal() > 1) {
				this.setCanal(getCanal() - 1);
			} else {
				this.setCanal(100);;
			}
		} else {
			System.out.println(msgD);
		}
	}

	@Override
	public void aumentarVolume(int vol) {
		if(this.isLigada()) {
			if(this.getVolume() + vol > 100) {
				this.setVolume(this.getVolume() + vol);
			} else {
				System.out.println("Não é possivel aumentar o volume.");
			}
		} else {
			System.out.println(msgD);
		}
	}

	@Override
	public void diminuirVolume(int vol) {
		if(this.isLigada()) {
			if(this.getVolume() - vol >= 0) {
				this.setVolume(this.getVolume() - vol);
			} else {
				System.out.println("Não é possivel diminuir o volume.");
			}
		} else {
			System.out.println(msgD);
		}
	}
}
