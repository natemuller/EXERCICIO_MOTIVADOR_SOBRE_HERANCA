# EXERCICIO_MOTIVADOR_SOBRE_HERANCA

1) Analise o código do programa fornecido pelo professor (cadastro de funcionários). Este
programa armazena os dados dos funcionários de uma empresa. Sobre cada funcionário
armazena o número de matrícula, o nome e o salário bruto. O cálculo do salário líquido é obtido
descontando-se do salário bruto 10% de INSS e 20% de imposto de renda sobre a faixa do salário
que exceder R$ 2.000,00. O programa permite que o usuário digite o número de matrícula de
um funcionário e então imprime seu salário bruto e salário líquido. Compile e teste este
programa. Desenhe o diagrama de classes correspondente antes de prosseguir.

2) Altere o programa do exercício 1 de maneira a considerar uma nova categoria de funcionários:
os funcionários de áreas de risco. Para estes o cálculo do salário líquido é um pouco diferente:
deve-se acrescentar 25% a título de insalubridade no salário. Este valor deve ser acrescido
depois do desconto do INSS e antes do cálculo do imposto de renda. Além disso, deve-se
armazenar a categoria do risco (como uma String). Essa categoria deve ser informada pelo
método construtor. Insira pelo menos mais 3 funcionários desse tipo no cadastro de
funcionários da empresa. Faça os ajustes necessários para que o programa execute
considerando agora as duas categorias de funcionários.

   double adicional = (salarioBruto - getINSS())*0.25;
   double novoSB = salarioBruto + adicional;
   if (novoSB <= LIM_ISENCAO_IR){
   return 0.0;
   }else{
   double aux = novoSB - LIM_ISENCAO_IR;
   double ir = aux * 0.2;
   return ir;
   }
   ^ Sugestão de alteração no método “getImpostoDeRenda” para atender ao cálculo proposto.

3) Altere o programa do exercício 2 de maneira a considerar uma nova categoria de funcionário:
os pesquisadores. Sobre cada pesquisador deve-se armazenar, também, a categoria de
especialização (passar essa informação (um inteiro) por parâmetro no método construtor).
Pesquisadores categoria 1 recebem um bônus de 5% aplicado depois dos descontos (o bônus é
isento de INSS e imposto de renda). Os da categoria 2 recebem 10% de bônus e os da categoria
3 bônus de 20%. Como a categoria do pesquisador pode variar ao longo do tempo, é necessário
existir um método para alterá-la se for o caso. Até o momento a empresa trabalha apenas com
estas 3 categorias, mas isso pode mudar com o tempo. Insira pelo menos mais 3 funcionários
desse tipo (um de cada categoria) no cadastro de funcionários da empresa. Faça os ajustes
necessários para que o programa execute considerando agora as três categorias de funcionários.

   
