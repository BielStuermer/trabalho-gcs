numero = input("Digite um número: ")
try:
	numero = int(numero)
	if numero % 2 == 0:
		print(f"{numero} não é ímpar.")
	else:
		print(f"{numero} não é par.")
except ValueError:
	print("Isso não é um número inteiro.")

