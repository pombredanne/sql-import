package com.neo4j.sqlimport;

import org.neo4j.graphdb.RelationshipType;

public enum TestRelationships implements RelationshipType{
	ROOT, IS_A, ISBN, PARENT_TAG, TAG_RELATION;

}