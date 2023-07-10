package Observer;

class OctalObserver extends Observer{

    OctalObserver(final Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
