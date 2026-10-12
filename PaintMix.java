public class PaintMix{
    final char[] paintOrder;


    public PaintMix(char[] paintOrder){
        this.paintOrder = paintOrder;
    }

    public char getPaint(int i){
        return this.paintOrder[i];
    }

    @Override
    public String toString(){
        String stringOut = "";
        for (int i = 0; i < this.paintOrder.length; i++){
            stringOut += paintOrder[i];
        }
        return stringOut;
    }
}
