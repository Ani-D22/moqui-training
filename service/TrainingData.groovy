def train = ec.entity.makeValue("MoquiTraining")
train.setFields(context, true, null, null)
train.setSequencedIdPrimary()
train.create()