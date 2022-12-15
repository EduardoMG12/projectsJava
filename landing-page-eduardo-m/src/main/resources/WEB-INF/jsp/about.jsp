<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./styles/styleAbout.css">
    <link rel="stylesheet" href="./styles/reset.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
        integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="./styles/scrollbar.css">
    <script src="./styles/script/script.js" defer></script>
</head>

<body>

    <header>
        <nav>
            <ul>
                <li class="c_text_menu"><a th:href="@{/}" class="text_menu">Home</a></li>
                <li class="c_text_menu"><a th:href="@{about}" class="text_menu">About</a></li>
                <li class="c_text_menu"><a href="https://my-page-bbhtxl4sw-eduardomg12.vercel.app" target="_blank"
                        class="text_menu">Portfolio</a></li>
            </ul>
        </nav>
        <ul class="icons_midias_social">
            <li><a href="https://www.linkedin.com/in/eduardomg12/" target="_blank"
                    class="fa-brands fa-linkedin-in icon_midias_sociais"></a></li>
            <li><a href="https://github.com/EduardoMG12" target="_blank"
                    class="fa-brands fa-github icon_midias_sociais"></a></li>
            <li><a href="https://api.whatsapp.com/send/?phone=5546999701602&text=vim+pela+sua+LandingPage&type=phone_number&app_absent=0"
                    target="_blank" class="fa-brands fa-whatsapp icon_midias_sociais"></a></li>
        </ul>
    </header>

    <section>
        <div class="row" id="row1">
            <div class="myImage" id="imageRow1"></div>
            <p id="row1Message"><%=age%></p>
        </div>
        <div class="row" id="row2">
            <p>
                Comecei aprendendo Python e até que evoluindo bem, após um mês estudando não tinha muita motivação
                para continuar pois eu já possuiá uma noção básica em lógica de programação,
                mas eu não tinha noção de que projetos que eu poderia aplicar meus conhecimentos.
                Após uns meses decidi dar mais uma chance a programação ou foi ao contrário
                Comecei a me interessar pelo desenvolvimento front-end
                Primeiramente estudei HTML e CSS após uns meses de muita dedicação e prática decidi ir para o
                JavaScript.
                Me dedicou a estudar e praticar, e logo estava criando sites um pouco complexos e bonitos.
                Quando pela "influência" e um amigo me inscrevi em um processo seletivo do FCamara em um projeto em
                grupo,
                Charles
                ficou animado com a oportunidade de colocar em prática tudo o que aprendera. O projeto era grande e
                exigia
                uma
                biblioteca de interface de usuário flexível e poderosa, então ele decidiu aprender React.

                Ele passou semanas estudando e praticando, e logo estava criando componentes reutilizáveis e construindo
                a
                interface
                do usuário do projeto. O trabalho em equipe foi bem-sucedido e o projeto foi um sucesso, o que deu a
                Charles
                ainda
                mais confiança em suas habilidades de programação.

                Hoje, Charles é um desenvolvedor front-end experiente e procurado, e continua aprendendo e se
                desenvolvendo
                em
                sua
                carreira. Ele está sempre pronto para enfrent
            </p>
            <div class="myImage" id="imageRow2"></div>
        </div>
    </section>


</body>

</html>