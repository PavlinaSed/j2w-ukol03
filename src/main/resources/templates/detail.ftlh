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
<div class="detail">()
    <div class="vizitka">
        <div class="jmeno">${cardDetail.name}</div>
        <div class="firma">${cardDetail.company}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${cardDetail.street}</div>
                <div><span>${cardDetail.zipCode}</span> ${cardDetail.municipality}</div>
            </div>
            <div class="kontakty">
                <div><i class="las la-at"></i>  [#if cardDetail.email??]<span>${cardDetail.email}</span>[#else]<small><em>not specified</em></small>[/#if]</div>
                <div><i class="las la-phone-alt"></i> [#if cardDetail.phone??]<span>${cardDetail.phone}</span>[#else]<small><em>not specified</em></small>[/#if]</div>
                <div><i class="las la-globe"></i> <span>${cardDetail.web}</span></div>
            </div>
        </div>
    </div>
    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${cardDetail.completeAddress?url}" width="100%" height="100%" frameborder="0"></iframe>
    </div>
</div>
</body>
</html>
