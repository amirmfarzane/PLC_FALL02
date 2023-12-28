actor Sender (0) {
	knownactors {
		Medium medium;
		Receiver rec;
		Medium rec;
	}

	actorvars {
		string receivedBit;
		string rec;
	}

	msghandler test(int a) {
        int hasSucceeded;
        string hasSucceeded;
        string receivedBit;
        a = 1 - -2;
        d = a+b*zz-dd*5;
        medium.pass(sendBit);
        self.sendMsg(1,2);
    }

	msghandler sendMeseg() {
		//receive(hasSucceeded)++++
		if (hasSucceeded == a) {
			if (sendBit == b){
				sendBit = 1;
			}
			else{
				sendBit = 2;
			}
		}

		selfffff.sendMsg();
	}


}

actor Sender (5){
	knownactors {
		Medium medium;
		Sender _sender;
	}

	actorvars {
	}

    msghandler sendMsg() {
        int bah;
        if(bah== bah){
            print("yaaaaay");
        }
    }

    msghandler sendMsg() {
            int bah;
            if(bah== bah){
                print("yaaaaay");
            }
        }

	msghandler receiveMsg(int msgBit) {
		messageBit =msgBit;
		//sender.receive(5);
	}
}

actor Sender(5) {
	knownactors {
		Receiver receiver;
		Sender _sender;
		Receiver receiver;
	}

	actorvars {
		int passMessage;
		int messageBit;
		int receiver;
	}

	msghandler test() {
		int messageBit;
		passMessage="ttt";
		print(a==b);
	}

	msghandler pass(int msgBit) {
	    if(1==2){}
        else {
            if(passMessage == "hello") {
                receiver.receiveMsg( msgBit);
            } else {
                //sender,receive("aa");
            }
        }
	}

	msghandler pass(int msgBit) {
    	    print(1);
    	    }
}

actor A (1){
    knownactors{}
    actorvars{}
}

actor A (1){
    knownactors{}
    actorvars{}
}


main {
	Sender b (medium, receiver):();
}