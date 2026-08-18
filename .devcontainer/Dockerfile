# Definição da imagem
FROM maven:3.9-eclipse-temurin-21-noble


# Desabilita a instalação interativa
ENV DEBIAN_FRONTEND=noninteractive


# Instala as ferramentas que não existem na imagem base
# Remove os arquivos temporários provenientes do processo de instalação 
# apt-get update - Atualiza os repositórios de software
# apt-get instal - Instala as ferramentos
# git-lfs -  ferramenta pra armazén de arquivos binários
# curl - Ferramenta pra testar API's
# app-get clean e rm - Limpam os arquivos temporários
RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    git \
    git-lfs \
    curl \
    unzip \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
