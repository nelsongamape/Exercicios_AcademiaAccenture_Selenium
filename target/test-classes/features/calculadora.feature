# language: pt
# encoding: utf-8

@calculadoraFunc
Funcionalidade: Calculadora

	@calculadora
  Cenario: Validar idade e signo
  	Dado que estou no formulario de calculo de idade e signo
		Quando preencho os campos obrigatorios <dia_aniversario>, <mes_aniversario>, <ano_aniversario>
		E pressiono o botao de calcular
  	Entao deve exibir a idade esperada <idade_esperada> e o signo do zoodiaco <signo_esperado> para aquela data
  
  	Exemplos: 
      | dia_aniversario |  mes_aniversario | ano_aniversario | idade_esperada | signo_esperado      |
      | "20"            | "May"            | "1991"          |  "30"          |    "Taurus"         |
      | "20"            | "December"       | "1988"          |  "33"          |    "Sagittarius"    |
      #| "12"            | "April"       | "1975"          |  "46"          |    "Aries"    |
      #| "23"            | "January"       | "1975"          |  "46"          |    "Aquarius"    |
      
      
  @calculadoraValidador
  Cenario: Validar seletores de mes de aniversario
 	Dado que estou no formulario de calculo de idade e signo
 	Entao deve exibir um seletor com todos os meses do ano em ordem