package com.example.myapplication

class Story {

    val decisionTrees = mutableListOf<DecisionTree>()

    val storySegments = mutableListOf<StorySegment>()

    fun addSegment (newSegment: StorySegment)  {

        storySegments.add(newSegment)

    }

    fun addDecisionTree (newDecisionTree: DecisionTree) {

        decisionTrees.add(newDecisionTree)

    }


}