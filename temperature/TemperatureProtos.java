// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temperature.proto

package temperature;

public final class TemperatureProtos {
  private TemperatureProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TemperatureOrBuilder extends
      // @@protoc_insertion_point(interface_extends:temperature.Temperature)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 timestamp = 1;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    long getTimestamp();

    /**
     * <code>required float celsius = 2;</code>
     */
    boolean hasCelsius();
    /**
     * <code>required float celsius = 2;</code>
     */
    float getCelsius();
  }
  /**
   * Protobuf type {@code temperature.Temperature}
   */
  public static final class Temperature extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:temperature.Temperature)
      TemperatureOrBuilder {
    // Use Temperature.newBuilder() to construct.
    private Temperature(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Temperature(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Temperature defaultInstance;
    public static Temperature getDefaultInstance() {
      return defaultInstance;
    }

    public Temperature getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Temperature(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              timestamp_ = input.readInt64();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              celsius_ = input.readFloat();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return temperature.TemperatureProtos.internal_static_temperature_Temperature_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return temperature.TemperatureProtos.internal_static_temperature_Temperature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              temperature.TemperatureProtos.Temperature.class, temperature.TemperatureProtos.Temperature.Builder.class);
    }

    public static com.google.protobuf.Parser<Temperature> PARSER =
        new com.google.protobuf.AbstractParser<Temperature>() {
      public Temperature parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Temperature(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Temperature> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int CELSIUS_FIELD_NUMBER = 2;
    private float celsius_;
    /**
     * <code>required float celsius = 2;</code>
     */
    public boolean hasCelsius() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required float celsius = 2;</code>
     */
    public float getCelsius() {
      return celsius_;
    }

    private void initFields() {
      timestamp_ = 0L;
      celsius_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCelsius()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, timestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, celsius_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, celsius_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static temperature.TemperatureProtos.Temperature parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static temperature.TemperatureProtos.Temperature parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static temperature.TemperatureProtos.Temperature parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static temperature.TemperatureProtos.Temperature parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(temperature.TemperatureProtos.Temperature prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code temperature.Temperature}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:temperature.Temperature)
        temperature.TemperatureProtos.TemperatureOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return temperature.TemperatureProtos.internal_static_temperature_Temperature_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return temperature.TemperatureProtos.internal_static_temperature_Temperature_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                temperature.TemperatureProtos.Temperature.class, temperature.TemperatureProtos.Temperature.Builder.class);
      }

      // Construct using temperature.TemperatureProtos.Temperature.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        celsius_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return temperature.TemperatureProtos.internal_static_temperature_Temperature_descriptor;
      }

      public temperature.TemperatureProtos.Temperature getDefaultInstanceForType() {
        return temperature.TemperatureProtos.Temperature.getDefaultInstance();
      }

      public temperature.TemperatureProtos.Temperature build() {
        temperature.TemperatureProtos.Temperature result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public temperature.TemperatureProtos.Temperature buildPartial() {
        temperature.TemperatureProtos.Temperature result = new temperature.TemperatureProtos.Temperature(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.celsius_ = celsius_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof temperature.TemperatureProtos.Temperature) {
          return mergeFrom((temperature.TemperatureProtos.Temperature)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(temperature.TemperatureProtos.Temperature other) {
        if (other == temperature.TemperatureProtos.Temperature.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasCelsius()) {
          setCelsius(other.getCelsius());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTimestamp()) {
          
          return false;
        }
        if (!hasCelsius()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        temperature.TemperatureProtos.Temperature parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (temperature.TemperatureProtos.Temperature) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000001;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private float celsius_ ;
      /**
       * <code>required float celsius = 2;</code>
       */
      public boolean hasCelsius() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required float celsius = 2;</code>
       */
      public float getCelsius() {
        return celsius_;
      }
      /**
       * <code>required float celsius = 2;</code>
       */
      public Builder setCelsius(float value) {
        bitField0_ |= 0x00000002;
        celsius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float celsius = 2;</code>
       */
      public Builder clearCelsius() {
        bitField0_ = (bitField0_ & ~0x00000002);
        celsius_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:temperature.Temperature)
    }

    static {
      defaultInstance = new Temperature(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:temperature.Temperature)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperature_Temperature_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_temperature_Temperature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021temperature.proto\022\013temperature\"1\n\013Temp" +
      "erature\022\021\n\ttimestamp\030\001 \002(\003\022\017\n\007celsius\030\002 " +
      "\002(\002B\023B\021TemperatureProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_temperature_Temperature_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_temperature_Temperature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_temperature_Temperature_descriptor,
        new java.lang.String[] { "Timestamp", "Celsius", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
