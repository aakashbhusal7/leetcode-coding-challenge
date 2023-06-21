var findRestaurant = function(list1, list2) {
    min = list1.length + list2.length;
    hash = {};
    list1.forEach((x, i) => {
        j = list2.indexOf(x);
        if (j == -1) return;
        if (i + j <= min) {
             min = i + j;
             hash[min] = [...(hash[min] || []), x];
        }
    });
    return hash[min];
};
