const btnVol = window.document.getElementById("btn_vol")
const btnInst = window.document.getElementById("btn_inst")
const formVol = window.document.getElementById("form_vol")
const formInst = window.document.getElementById("form_inst")

function forminst() {
    formVol.classList.add("off")
    formInst.classList.remove("off")
}

function formvol() {
    formVol.classList.remove("off")
    formInst.classList.add("off")
}