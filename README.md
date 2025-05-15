QUESTAO 4

A) Arrays de tipos primitivos: Reservam um bloco de memória contíguo do tamanho exato necessário para armazenar todos os seus valores. Por exemplo, um array de 5 inteiros reserva espaço suficiente para 5 inteiros, todos juntos na memória.

Arrays de objetos: Reservam um bloco de memória contíguo para armazenar referências. Essas referências são como ponteiros que indicam onde os objetos estão realmente armazenados na memória. Os objetos em si são armazenados em outra área da memória, não diretamente dentro do array.

B) Ao acessar elementos de um array de objetos, é fundamental verificar se a referência no índice desejado aponta para um objeto válido. Se a referência for nula (não aponta para nenhum objeto), tentar acessar qualquer membro desse objeto resultará em um erro. Portanto, sempre verifique se a referência não é nula antes de usá-la.
