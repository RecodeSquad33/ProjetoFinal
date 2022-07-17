
const btnVol = window.document.getElementById("btn_vol")
const btnInst = window.document.getElementById("btn_inst")
const formVol = window.document.getElementById("form_vol")
const formInst = window.document.getElementById("form_inst")
const ladoEsq = window.document.querySelector(".lado-esquerdo")

function forminst() {
    ladoEsq.classList.add("on")
    formVol.classList.add("off")
    formInst.classList.remove("off")
}

function formvol() {
    ladoEsq.classList.add("on")
    formVol.classList.remove("off")
    formInst.classList.add("off")
}
