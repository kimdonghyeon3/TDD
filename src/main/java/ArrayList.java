

public class ArrayList {
    private Integer[] datas;

    ArrayList() {
        datas = new Integer[0];
    }

    public void add(int data, int index){

        Integer[] newData = new Integer[datas.length + 1];

        if(index == datas.length){
            for(int i = 0 ; i < datas.length ; i++){
                newData[i] = datas[i];
            }
            newData[newData.length-1] = data;
        }else{
            int j = 0;
            for(int i = 0 ; i < newData.length ; i++){
                if(i == index){
                    newData[i] = data;
                    continue;
                }
                newData[i] = datas[j++];
            }
        }
        System.out.println("배열의 크기가 증가되었습니다. " + datas.length + " => " + newData.length);
        datas = newData;
    }

    public void add(int data) {
        add(data, datas.length);
    }

    public Integer get(int index) {
        return datas[index];
    }

    public int size() {
        return datas.length;
    }

    public void remove(int index) {
        Integer[] newData = new Integer[datas.length - 1];
        int j = 0;
        for(int i = 0 ; i < datas.length ; i++){
            if(i != index) {
                newData[j++] = datas[i];
            }
        }
        datas = newData;
    }

    public void removeAt(int index) {
        remove(index);
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0 ; i < datas.length ; i++){
            System.out.println( i + " : " + datas[i]);
        }
    }

    public int getArrayLength() {
        return datas.length;
    }
}
