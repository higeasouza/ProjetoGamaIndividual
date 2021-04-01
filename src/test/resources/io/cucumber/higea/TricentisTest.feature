#language: pt

Funcionalidade: Envio de informacoes no site tricentis 
    O objetivo é acessar o site da tricentis e preencher as informacoes
    para solicitar o seguro de veiculo     
    
    Cenario: Preencher as informacoes para requerimento de seguro 
        Dado que eu estou no site da tricentis 
        E clico na aba automobile
        E seleciono a opcao "Nissan"
        E preencho o campo Engine Performance "1000"
        E preencho o campo Date of Manufacture "03/05/2021"
        E preencho o campo Number of Seats "1"
        E marco o campo Fuel Tupe "Petrol"
        //E preencho o campo Total Weight "1000"
        E preencho o campo List Price "1000"
        E preencho o campo License Plate Number "0000"
        E preencho o campo Annual Mileage "1000"
        E clico no botao next enter insurant data


        Então preencho o campo First Name "Higea"
        E preencho o campo Last Name "Souza"
        E preencho o campo Date of Birth "03/12/2000"
        E marco o campo  Gender "Female"
        E preencho o campo Street Address "Rua 1"
        E seleciono o campo Country "Brasil" 
        E preencho o campo Zip Code "00000000"
        E preencho o campo City "Belo Horizonte"
        E marco o campo Occupation "Employee"
        E marco o campo Hobbies "Speending"
        E preencho o campo Website "https://teste.com"
        E clico no botao next enter product data


        E preencho o campo Start Date "05/05/2021"
        E marco o campo Insurance Sum "10.000.000,00"
        E marco o campo Merit Rating "Bonus 1"
        E marco o campo Damage Insurance "No Coverage"
        E seleciono o campo Optional Products "Euro Protection"
        E marco o campo "No"
        E clico no botao next select price option 
    
        E seleciono o campo Platinum
        E clico no botao next send quote


        E preencho o campo email "higeasouza@gmail.com"
        E preencho o campo phone "99999999"
        E preencho o campo username "higea"
        E preencho o campo senha "123abcABC"
        E confirmo a senha "123abcABC"
        E clico no botao send

        Entao eu devo ver a popup de sucesso


