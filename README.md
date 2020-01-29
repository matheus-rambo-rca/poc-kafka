# poc-kafka

# Tópicos
O tópico é uma categoria na qual registros são publicados. Tópicos poderão ter múltiplos consumidores, isto é, um tópico pode ter nenhum, um ou muitos consumidores que consomem os registrso que são publicados no tópico.

## Partições
Para cada tópico, O cluster do Kafka mantém um registro de logs particionando, que se parece com a seguinte imagem.

![image](https://user-images.githubusercontent.com/60265139/73369847-0a149180-4292-11ea-83dd-3fa618f1a71a.png)

Cada partição, é uma sequência ordenada de registros que constantemente sofre alterações(novos registros são publicados). Para cada registro nas partições, é vinculado um ***id sequencial*** chamado de ***offset*** que identifica um registro único em uma partição.

O *cluster* grava todos os registros, consumidos ou não

	

