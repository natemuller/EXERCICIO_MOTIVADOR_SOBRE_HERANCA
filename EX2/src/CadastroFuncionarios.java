import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    private void carregaFuncionarios() {
        funcionarios.add(new Funcionario("B9434","Lulu Pata",12438.0, true, "AIDS"));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("A9931","Emile Pata",12438.0, true, "CANCER"));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("B9234","Rita Pata",12438.0, true, "SARS"));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("A9834","Natan Pato",12438.0, true, "CANCER"));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("B9939","Juca Pato",12438.0, true, "AIDS"));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0, false, ""));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0, false, ""));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0, false, ""));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0, false, ""));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0, false, ""));
        System.out.println("Adicionando funcionário: " + funcionarios.get(0).getNome());
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0, false, ""));
        
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}