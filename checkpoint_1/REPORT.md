# Relatório

## Descrição Geral

O aplicação utiliza o algoritmo de compressão Run-Length Encoding (RLE) para realizar a compressão de uma cadeia de nucleotídeos de um arquivo. A leitura é feita a partir do caminho do arquivo informado ao rodar a aplicação.

## Estrutura do Código

1. **Método `compressRLE(String inp)`**: 
   - Este método é responsável pela compressão do texto usando o algoritmo RLE.
   - Ele percorre cada caractere da string de entrada, contando a quantidade de caracteres consecutivos iguais e armazenando esse valor em um `StringBuilder`.
   - O resultado final é uma string que representa o texto comprimido, onde cada caractere é seguido pelo número de vezes que aparece consecutivamente.

2. **Método `main(String[] args)`**
    - Entry point da aplicação.
    - Aqui o arquivo é aberto e convertido para uma string e enviado para o metodo compressRLE

## Resultados e Saídas

- **Tamanho dos Arquivos**: O código calcula e exibe o tamanho do arquivo de entrada e do arquivo comprimido.
- **Taxa de Compressão**: A taxa de compressão é calculada em porcentagem, representando a eficiência da compressão aplicada.
- **Relatório Formatado**: No final é "printado" um relatório contendo:
  - Nome do arquivo de entrada.
  - Nome do arquivo de saída.
  - Tamanho dos arquivos em bytes.
  - Taxa de compressão.

