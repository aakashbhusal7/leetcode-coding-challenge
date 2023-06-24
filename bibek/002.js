var maxProfit = prices => prices.reduce((a, b) => ({
    min: a.min > b ? b : a.min,
    max: a.max < b - a.min ? b - a.min : a.max
}), { min: prices[0], max: 0}).max;
