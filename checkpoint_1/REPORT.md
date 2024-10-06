# Relatório

## Descrição Geral

A aplicação utiliza o algoritmo de compressão Run-Length Encoding (RLE) para realizar a compressão de uma cadeia de nucleotídeos de um arquivo. A leitura é feita a partir do caminho do arquivo informado ao rodar a aplicação. A estrutura modular do código permite fácil manutenção e expansão.

## Estrutura do Código

1. **Classe `App`**: 
   - Método `main(String[] args)`: 
     - Ponto de entrada da aplicação.
     - Recebe os caminhos do arquivo de entrada e saída como argumentos.
     - Utiliza a classe `FileHandler` para ler o arquivo de entrada e a classe `NucleotidesCompresser` para realizar a compressão dos dados.
     - Os resultados comprimidos são escritos em um arquivo de saída, e um resumo é impresso na tela.

2. **Classe `FileHandler`**: 
   - Método `readFile(String file)`: 
     - Lê o conteúdo de um arquivo e retorna uma lista de strings (linhas do arquivo).
   - Método `getFileSize(String file)`: 
     - Retorna o tamanho do arquivo em bytes.
   - Método `writeFile(String file, String content)`: 
     - Escreve o conteúdo comprimido em um arquivo de saída.

3. **Classe `NucleotidesCompresser`**: 
   - Método `compress(String input)`: 
     - Responsável pela compressão do texto usando o algoritmo RLE.
     - Percorre cada caractere da string de entrada, contando a quantidade de caracteres consecutivos iguais e armazenando esse valor em um `StringBuilder`.
     - O resultado final é uma string que representa o texto comprimido, onde cada caractere é seguido pelo número de vezes que aparece consecutivamente.

4. **Classe `SummaryPrinter`**: 
   - Método `printSummary(String inputFileName, String outputFileName, List<String> inputLines, String compressedOutput)`: 
     - Imprime um relatório formatado com informações sobre a execução da aplicação.
     - Exibe detalhes como o nome do arquivo de entrada, nome do arquivo de saída, tamanhos dos arquivos, taxa de compressão e frequências dos nucleotídeos.

## Resultados e Saídas

- **Tamanho dos Arquivos**: O código calcula e exibe o tamanho do arquivo de entrada e do arquivo comprimido.
- **Taxa de Compressão**: A taxa de compressão é calculada em porcentagem, representando a eficiência da compressão aplicada.
- **Relatório Formatado**: Ao final da execução, é impresso um relatório contendo:
  - Nome do arquivo de entrada.
  - Nome do arquivo de saída.
  - Tamanho dos arquivos em bytes.
  - Taxa de compressão.
  - Frequências dos nucleotídeos presentes na entrada.
