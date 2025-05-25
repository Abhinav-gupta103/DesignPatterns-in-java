package models.Theatre;

public class Seat {
    int seatId;
    int row;
    int ScreenCategory;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getScreenCategory() {
        return ScreenCategory;
    }

    public void setScreenCategory(int screenCategory) {
        ScreenCategory = screenCategory;
    }

}
