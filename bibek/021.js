lemonadeChange = bills => {
    obj = {
        5: 0,
        10: 0,
        20: 0
    };
    for (i = 0; i < bills.length; i++) {
        b = bills[i];
        obj[b]++;
        switch (b) {
            case 10:
                if (obj[5] == 0) {
                    return false;
                }
                obj[5]--;
                break;
            case 20:
                if (obj[10] && obj[5]) {
                    obj[10]--;
                    obj[5]--;
                    break;
                } else if (obj[5] >= 3) {
                    obj[5] -= 3;
                    break;
                }
                return false;
            default:
                break;
        }
    }
    return true;
}
