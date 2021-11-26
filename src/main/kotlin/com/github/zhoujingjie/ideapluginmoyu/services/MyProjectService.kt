package com.github.zhoujingjie.ideapluginmoyu.services

import com.intellij.openapi.project.Project
import com.github.zhoujingjie.ideapluginmoyu.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
