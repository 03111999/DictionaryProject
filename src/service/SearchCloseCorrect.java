package service;

public class SearchCloseCorrect {

    String s;
    int i, j, k, loi, saiSo;

    public boolean Compare(String s1, String s) {
        saiSo = (int) Math.round(s.length() * 0.3);
        if (s1.length() < (s.length() - saiSo) || s1.length() > (s.length() + saiSo)) {
            return false;
        }
        i = j = loi = 0;
        while (i < s.length() && j < s1.length()) {
            if (s.charAt(i) != s1.charAt(j)) {
                loi++;
                for (k = 1; k <= saiSo; k++) {
                    if ((i + k < s.length()) && s.charAt(i + k) == s1.charAt(j)) {
                        i += k;
                        break;
                    } else if ((j + k < s1.length()) && s.charAt(i) == s1.charAt(j + k)) {
                        j += k;
                        break;
                    }
                }
            }
            i++;
            j++;
        }
        loi += s.length() - i + s1.length() - j;
        if (loi <= saiSo) {
            return true;
        } else {
            return false;
        }
    }
}
