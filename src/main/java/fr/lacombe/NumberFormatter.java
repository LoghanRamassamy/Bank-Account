package fr.lacombe;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class NumberFormatter {
    private Double number;

    public NumberFormatter(Double number) {
        this.number = number;
    }

    public String format() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("€");
        dfs.setGroupingSeparator(' ');
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);

        df.setDecimalFormatSymbols(dfs);

        return df.format(number);
    }
}
