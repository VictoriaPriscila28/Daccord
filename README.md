

# ichords - O Seu Companheiro Musical
<img src="https://github.com/VictoriaPriscila28/ichords/assets/88152540/e940c979-36e3-46ee-97a8-5c148dd6cde6" alt="ichordsLogo" width="150" height="150">

O iChords é um aplicativo de aprendizado de violão desenvolvido no Android Studio utilizando a linguagem Kotlin. Ele é projetado para entusiastas de música e violão, desde iniciantes até músicos experientes. Com uma variedade de recursos, o iChords ajuda a aprimorar suas habilidades musicais.

### Nota de esclarecimento!
Este projeto foi desenvolvido para a residência tecnológica do Porto Digital em parceria com a 
empresa Daccord Music Software, para que o squad pudesse realizar uma releitura do seu aplicativo 'ichords', buscando 
implementar novas funcionalidades voltadas ao aprendizado do violão.
A priori este aplicativo não possui backend estruturado nem banco de dados, pois, o intuito era de focar no "front-end", entretanto 
no futuro próximo será realizado essas ações.
Por fim, se desejar ter uma melhor experiência, por favor visite o protótipo navegável feito no Figma! O link está na descrição.

## Funcionalidades Principais

### Aulas de Violão
O iChords oferece uma ampla coleção de aulas de violão para todos os níveis. Desde acordes básicos até técnicas avançadas de dedilhado, nosso aplicativo cobre tudo. As aulas são em vídeo e vão desde o básico até as músicas mais populares do momento.

### Criação de Playlist
Monte sua própria coleção de músicas favoritas no iChords. Crie playlists personalizadas para praticar, ouça suas músicas preferidas e aprimore suas habilidades musicais.

### Afinador Integrado
Manter seu violão afinado é fundamental. O iChords inclui um afinador integrado que ajuda você a manter as cordas do seu violão afinadas. Basta tocar as cordas e deixar o aplicativo fazer o trabalho.

## Requisitos do Sistema

- Dispositivo Android com sistema operacional 5.0 ou superior.
- Espaço de armazenamento para vídeos e músicas.
- Microfone para uso do afinador.

# Guia de Instalação do Projeto no Android Studio

Este guia fornece instruções passo a passo sobre como instalar e configurar o projeto no Android Studio.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em seu sistema:

- [Android Studio](https://developer.android.com/studio)
- [Git](https://git-scm.com/)
- Acesso à Internet

## Passo 1: Clonar o Repositório

Abra o terminal e navegue até o diretório em que você deseja clonar o projeto. Execute o seguinte comando para clonar o repositório do projeto:

bash
git clone https://github.com/VictoriaPriscila28/Daccord.git

## Passo 2: Abrir o Projeto no Android Studio

Abra o Android Studio.
Clique em "File" (Arquivo) no menu principal.
Selecione "Open" (Abrir).
Navegue até o diretório onde você clonou o repositório do projeto e selecione a pasta raiz do projeto.
Clique em "OK" para abrir o projeto.

## Passo 3: Configurar o Dispositivo Virtual (Emulador)

Se você planeja executar o aplicativo em um emulador, siga estas etapas:

No Android Studio, clique no ícone "AVD Manager" na barra de ferramentas ou acesse "Tools" > "AVD Manager".
Clique em "Create Virtual Device" (Criar Dispositivo Virtual).
Selecione um dispositivo e uma imagem do sistema que você deseja usar para o emulador.
Siga as etapas do assistente para criar o emulador.

## Passo 4: Compilar e Executar o Projeto

No Android Studio, clique no botão "Run" (Executar) ou pressione "Shift + F10" para compilar e executar o projeto.
Selecione o dispositivo virtual que você configurou no Passo 3 ou conecte um dispositivo físico.
Aguarde o Android Studio compilar o projeto e iniciar o aplicativo.
Parabéns! Você instalou e configurou o projeto no Android Studio e está pronto para começar a desenvolver.

Lembre-se de consultar a documentação do projeto e os requisitos específicos de configuração, pois podem variar de projeto para projeto.



## Especificações:


### SDK Versions

compileSdkVersion 33

buildToolsVersion "30.0.3"

minSdkVersion 23

targetSdkVersion 33


### Libraries

1. Retrofit- REST API Call
   https://square.github.io/retrofit/
2. Glide - Image Loading and caching.
   https://github.com/bumptech/glide
3. Material Design Components - Google's latest Material Components.
   https://material.io/develop/android
4. koin - Dependency Injection
   https://insert-koin.io/

### Figma design guideline for better accuracy

Read our guidelines to increase the accuracy of design conversion to code by optimizing Figma designs.
https://docs.dhiwise.com/docs/Designguidelines/intro .

### Built with AndroidX Support

Requires Android Studio Arctic Fox | 2020.3.1 or higher.

Current Kotlin Version 1.7.20




