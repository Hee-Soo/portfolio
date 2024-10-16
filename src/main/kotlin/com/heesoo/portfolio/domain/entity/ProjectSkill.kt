package com.heesoo.portfolio.domain.entity

import BaseEntity
import jakarta.persistence.*


@Entity
class ProjectSkill(project: Project, skill: Skill): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column  (name = "project_skill_id")

    var id: Long? = null
    @ManyToOne(targetEntity = Project::class, fetch = FetchType.LAZY)
    @JoinColumn(name="project_id")
    var project: Project = project



    @ManyToOne(targetEntity = Project::class, fetch = FetchType.LAZY)
    @JoinColumn(name="skill_id")
    var skill: Skill = skill
}