package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {



//    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//    val mouse = DaggerNewComponent.create().getMouse()
//    val monitor = DaggerNewComponent.create().getMonitor()


    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse

    init {
        DaggerNewComponent.create().inject(this)
    }

}