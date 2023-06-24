var tcribe = (w, order) => w.split``.map(a => 'abcdefghijklmnopqrstuvwxyz'[order.indexOf(a)]).join``;
var isAlienSorted = (arr, order) => arr.reduce((a, b, i) => a && (i == 0 || tcribe(b, order) >= tcribe(arr[i - 1], order)), true);
