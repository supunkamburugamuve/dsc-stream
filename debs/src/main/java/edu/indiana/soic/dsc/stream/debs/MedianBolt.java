package edu.indiana.soic.dsc.stream.debs;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

import java.util.Map;

public class MedianBolt extends BaseRichBolt {
  @Override
  public void prepare(Map map, TopologyContext topologyContext, OutputCollector outputCollector) {

  }

  @Override
  public void execute(Tuple tuple) {

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {

  }
}
