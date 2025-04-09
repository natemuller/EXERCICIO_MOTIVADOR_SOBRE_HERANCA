public class Funcionario {
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private boolean areaDeRisco;
    private String categoriaAreaDeRisco;
    
    public Funcionario(String matricula, String nome, double salarioBruto, boolean areaDeRisco, String categoriaAreaDeRisco) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.areaDeRisco = areaDeRisco;
        this.categoriaAreaDeRisco = categoriaAreaDeRisco;
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}

    public boolean isAreaDeRisco() {
        return areaDeRisco;
    }

    public String getCategoriaAreaDeRisco() {
        return categoriaAreaDeRisco;
    }
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        double adicional = (salarioBruto - getINSS())*0.25;
        double novoSB = salarioBruto + adicional;
        if (novoSB <= LIM_ISENCAO_IR){
            return 0.0;
        }
        else {
            double aux = novoSB - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){
        if (areaDeRisco) {
            double aux = salarioBruto - getINSS();
            aux *= 0.25;
            return aux - getImpRenda();

        }
        else {
            return salarioBruto - getINSS() - getImpRenda();
        }
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        if (this.isAreaDeRisco()){
            aux += "Area de risco: Sim\n";
            aux += "Categoria: "+this.getCategoriaAreaDeRisco()+"\n";
        }
        else {
            aux += "Area de risco: Nao\n";
        }
        return aux;    
    }
}