var canPlaceFlowers = (f, n) => (('0' + f.join`` + '0').match(/000+/g)?.map(x => Math.floor((x.length - 1) / 2))?.reduce((a, b) => a + b, 0) ?? 0) >= n;
