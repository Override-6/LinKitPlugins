/*
 *  Copyright (c) 2021. Linkit and or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can only use it for personal uses, studies or documentation.
 *  You can download this source code, and modify it ONLY FOR PERSONAL USE and you
 *  ARE NOT ALLOWED to distribute your MODIFIED VERSION.
 *
 *  Please contact maximebatista18@gmail.com if you need additional information or have any
 *  questions.
 */

package fr.linkit.plugin.debug.commands

import fr.linkit.api.connection.cache.obj.behavior.annotation.BasicRemoteInvocationRule.BROADCAST
import fr.linkit.api.connection.cache.obj.behavior.annotation.{MethodControl => MC}

import scala.annotation.meta.setter
import scala.collection.mutable.ListBuffer

case class Player(@(MC@setter)(BROADCAST) id: Int,
                  @(MC@setter)(BROADCAST) owner: String,
                  @(MC@setter)(BROADCAST) var name: String,
                  @(MC@setter)(BROADCAST) var x: Long,
                  @(MC@setter)(BROADCAST) var y: Long) extends Serializable {
    var list: ListBuffer[_] = ListBuffer.empty
    def this(other: Player) = {
        this(other.id, other.owner, other.name, other.x, other.y)
    }

}
