package MentorMate;

public class LogoBuilder {
    private static final String LOGO_EMPTY_SPACE = "-";
    private static final String LOGO_FILLER = "*";
    private StringBuilder stringBuilder;
    private int scale;

    public LogoBuilder(int scale) {
        this.setScale(scale);
        this.stringBuilder = new StringBuilder();
    }

    private void setScale(int scale) {
        if (scale % 2 == 0) {
            throw new IllegalArgumentException("N must be an odd number!");
        }
        if (scale <= 2 || scale >= 10000) {
            throw new IllegalArgumentException("N must be between 2 and 10000 (non-inclusive)!");
        }
        this.scale = scale;
    }

    public void printLogo() {
        printUpperHalfOfLogo(scale);
        printLowerHalfOfLogo(scale);
    }

    private void printLowerHalfOfLogo(int scale) {
        for (int i = 0; i < scale / 2 + 1; i++) {
            stringBuilder.setLength(0);
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(scale / 2 - i));
            stringBuilder.append(LOGO_FILLER.repeat(scale));
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(1 + 2 * i));
            stringBuilder.append(LOGO_FILLER.repeat(2 * scale - 1 - 2 * i));
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(1 + 2 * i));
            stringBuilder.append(LOGO_FILLER.repeat(scale));
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(scale / 2 - i));
            System.out.println(stringBuilder.toString().repeat(2));
        }
    }

    private void printUpperHalfOfLogo(int scale) {
        for (int i = 0; i < scale / 2 + 1; i++) {
            stringBuilder.setLength(0);
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(scale - i));
            stringBuilder.append(LOGO_FILLER.repeat(scale + 2 * i));
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(scale - 2 * i));
            stringBuilder.append(LOGO_FILLER.repeat(scale + 2 * i));
            stringBuilder.append(LOGO_EMPTY_SPACE.repeat(scale - i));
            System.out.println(stringBuilder.toString().repeat(2));
        }
    }
}
