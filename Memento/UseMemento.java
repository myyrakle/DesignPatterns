import java.util.LinkedList;
import java.util.Queue;

class GamePlayer
{
    private int level = 1;
    private int lifePoint = 300;
    private int strength = 5;
    //...
    private int money = 100;

    public void play()
    {
        //...
    }

    public GamePlayer clone()
    {
        GamePlayer cloneObject = new GamePlayer();
        cloneObject.level = this.level;
        cloneObject.lifePoint = this.lifePoint;
        cloneObject.strength = this.strength;
        cloneObject.money = this.money;
        return cloneObject;
    }
}

//메멘토 관리자
class Originator
{
    private GamePlayer player = new GamePlayer();

    public void play()
    {
        player.play();
    }

    //메멘토 생성
    public Memento saveToMemento()
    {
        return new Memento(player.clone());
    }

    //메멘토로 저장된 상태 복구
    public void restoreFromMemento(Memento memento)
    {
        player = memento.getState();
    }

    class Memento
    {
        private GamePlayer state;

        public Memento(GamePlayer player)
        {
            state = player;
        }

        //가장 최근 상태 반환
        public GamePlayer getState()
        {
            return state;
        }
    }
}

public class UseMemento
{
    public static void main(String[] args)
    {
        //메멘토 저장용 큐
        Queue<Originator.Memento> mementos = new LinkedList<>();

        Originator originator = new Originator();

        originator.play(); //플레이
        mementos.add(originator.saveToMemento()); //상태 저장

        originator.play(); //플레이
        mementos.add(originator.saveToMemento()); //상태 저장

        originator.play(); //플레이
        originator.restoreFromMemento(mementos.poll()); //롤백
        originator.play(); //플레이
    }
}
