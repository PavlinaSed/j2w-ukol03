[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
[#list listOfCards as card]
<div class="seznam">
    <a href="/detail/${card?index}">
        <div class="vizitka">
            <div class="jmeno">${card.name}</div>
            <div class="firma">${card.company}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${card.street}</div>
                    <div><span>${card.zipCode}</span>${card.municipality}</div>
                </div>
                <div class="kontakty">
                    <div><i class="las la-at"></i> [#if card.email??] <span>${card.email}</span>[#else]<small><em>not specified</em></small>[/#if]</div>
                    <div><i class="las la-phone-alt"></i>[#if card.phone??]<span>${card.phone}</span>[#else]<small><em>not specified</em></small>[/#if]</div>
                    <div><i class="las la-globe"></i>[#if card.web??]<span>${card.web}</span>[#else]<small><em>not specified</em></small>[/#if]</div>
                </div>
            </div>
        </div>
    </a>
</div>
[/#list]
</body>
</html>
