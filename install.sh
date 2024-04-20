#!/bin/bash

# Define o URL do arquivo a ser baixado
file_url="https://github.com/zaproxy/zaproxy/releases/download/v2.14.0/ZAP_2_14_0_unix.sh"

# Define o nome do arquivo
file_name="ZAP_2_14_0_unix.sh"

# Baixa o arquivo
wget "$file_url" -O "$file_name"

# Concede permissão de execução ao arquivo
chmod +x "$file_name"

# Executa o arquivo
./"$file_name"
