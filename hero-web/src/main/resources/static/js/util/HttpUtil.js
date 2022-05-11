const SUCCESS_CODE = 20000;

function httpGet(url, params) {
    let data;
    $.ajax({
        type: 'GET',
        async: false,
        url: url,
        contentType: 'application/json;charset=utf-8',
        data: params,
        dataType: "json",
        success: function (res) {
            if (res.code == SUCCESS_CODE) {
                data = res.data;
            } else {
                console.log(res);
                data = null;
            }
        },
        error: function (res) {
            console.log(res);
        }
    })
    return data;
}

function httpPost(url, params) {
    let data;
    $.ajax({
        type: 'POST',
        async: false,
        url: url,
        contentType: 'application/json;charset=utf-8',
        data: JSON.stringify(params),
        dataType: "json",
        success: function (res) {
            if (res.code == SUCCESS_CODE) {
                data = res.data;
            } else {
                console.log(res);
                data = null;
            }
        },
        error: function (res) {
            console.log(res);
        }
    })
    return data;
}