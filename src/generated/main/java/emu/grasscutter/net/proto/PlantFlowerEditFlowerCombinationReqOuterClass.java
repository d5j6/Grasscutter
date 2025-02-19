// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlantFlowerEditFlowerCombinationReq.proto

package emu.grasscutter.net.proto;

public final class PlantFlowerEditFlowerCombinationReqOuterClass {
  private PlantFlowerEditFlowerCombinationReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlantFlowerEditFlowerCombinationReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlantFlowerEditFlowerCombinationReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     * @return Whether the flowerCombinationInfo field is set.
     */
    boolean hasFlowerCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     * @return The flowerCombinationInfo.
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getFlowerCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getFlowerCombinationInfoOrBuilder();

    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 8104
   * Obf: HKKNDLNFJAH
   * </pre>
   *
   * Protobuf type {@code PlantFlowerEditFlowerCombinationReq}
   */
  public static final class PlantFlowerEditFlowerCombinationReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlantFlowerEditFlowerCombinationReq)
      PlantFlowerEditFlowerCombinationReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlantFlowerEditFlowerCombinationReq.newBuilder() to construct.
    private PlantFlowerEditFlowerCombinationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlantFlowerEditFlowerCombinationReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlantFlowerEditFlowerCombinationReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlantFlowerEditFlowerCombinationReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 32: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 48: {

              entityId_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder = null;
              if (flowerCombinationInfo_ != null) {
                subBuilder = flowerCombinationInfo_.toBuilder();
              }
              flowerCombinationInfo_ = input.readMessage(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(flowerCombinationInfo_);
                flowerCombinationInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.internal_static_PlantFlowerEditFlowerCombinationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.internal_static_PlantFlowerEditFlowerCombinationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.class, emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 6;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FLOWER_COMBINATION_INFO_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo flowerCombinationInfo_;
    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     * @return Whether the flowerCombinationInfo field is set.
     */
    @java.lang.Override
    public boolean hasFlowerCombinationInfo() {
      return flowerCombinationInfo_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     * @return The flowerCombinationInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getFlowerCombinationInfo() {
      return flowerCombinationInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : flowerCombinationInfo_;
    }
    /**
     * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getFlowerCombinationInfoOrBuilder() {
      return getFlowerCombinationInfo();
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (scheduleId_ != 0) {
        output.writeUInt32(4, scheduleId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(6, entityId_);
      }
      if (flowerCombinationInfo_ != null) {
        output.writeMessage(13, getFlowerCombinationInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scheduleId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, entityId_);
      }
      if (flowerCombinationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getFlowerCombinationInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq other = (emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasFlowerCombinationInfo() != other.hasFlowerCombinationInfo()) return false;
      if (hasFlowerCombinationInfo()) {
        if (!getFlowerCombinationInfo()
            .equals(other.getFlowerCombinationInfo())) return false;
      }
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasFlowerCombinationInfo()) {
        hash = (37 * hash) + FLOWER_COMBINATION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getFlowerCombinationInfo().hashCode();
      }
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 8104
     * Obf: HKKNDLNFJAH
     * </pre>
     *
     * Protobuf type {@code PlantFlowerEditFlowerCombinationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlantFlowerEditFlowerCombinationReq)
        emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.internal_static_PlantFlowerEditFlowerCombinationReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.internal_static_PlantFlowerEditFlowerCombinationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.class, emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        if (flowerCombinationInfoBuilder_ == null) {
          flowerCombinationInfo_ = null;
        } else {
          flowerCombinationInfo_ = null;
          flowerCombinationInfoBuilder_ = null;
        }
        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.internal_static_PlantFlowerEditFlowerCombinationReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq build() {
        emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq buildPartial() {
        emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq result = new emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq(this);
        result.entityId_ = entityId_;
        if (flowerCombinationInfoBuilder_ == null) {
          result.flowerCombinationInfo_ = flowerCombinationInfo_;
        } else {
          result.flowerCombinationInfo_ = flowerCombinationInfoBuilder_.build();
        }
        result.scheduleId_ = scheduleId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq other) {
        if (other == emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasFlowerCombinationInfo()) {
          mergeFlowerCombinationInfo(other.getFlowerCombinationInfo());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo flowerCombinationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> flowerCombinationInfoBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       * @return Whether the flowerCombinationInfo field is set.
       */
      public boolean hasFlowerCombinationInfo() {
        return flowerCombinationInfoBuilder_ != null || flowerCombinationInfo_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       * @return The flowerCombinationInfo.
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getFlowerCombinationInfo() {
        if (flowerCombinationInfoBuilder_ == null) {
          return flowerCombinationInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : flowerCombinationInfo_;
        } else {
          return flowerCombinationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public Builder setFlowerCombinationInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (flowerCombinationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          flowerCombinationInfo_ = value;
          onChanged();
        } else {
          flowerCombinationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public Builder setFlowerCombinationInfo(
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (flowerCombinationInfoBuilder_ == null) {
          flowerCombinationInfo_ = builderForValue.build();
          onChanged();
        } else {
          flowerCombinationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public Builder mergeFlowerCombinationInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (flowerCombinationInfoBuilder_ == null) {
          if (flowerCombinationInfo_ != null) {
            flowerCombinationInfo_ =
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(flowerCombinationInfo_).mergeFrom(value).buildPartial();
          } else {
            flowerCombinationInfo_ = value;
          }
          onChanged();
        } else {
          flowerCombinationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public Builder clearFlowerCombinationInfo() {
        if (flowerCombinationInfoBuilder_ == null) {
          flowerCombinationInfo_ = null;
          onChanged();
        } else {
          flowerCombinationInfo_ = null;
          flowerCombinationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getFlowerCombinationInfoBuilder() {
        
        onChanged();
        return getFlowerCombinationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getFlowerCombinationInfoOrBuilder() {
        if (flowerCombinationInfoBuilder_ != null) {
          return flowerCombinationInfoBuilder_.getMessageOrBuilder();
        } else {
          return flowerCombinationInfo_ == null ?
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : flowerCombinationInfo_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo flower_combination_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getFlowerCombinationInfoFieldBuilder() {
        if (flowerCombinationInfoBuilder_ == null) {
          flowerCombinationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getFlowerCombinationInfo(),
                  getParentForChildren(),
                  isClean());
          flowerCombinationInfo_ = null;
        }
        return flowerCombinationInfoBuilder_;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlantFlowerEditFlowerCombinationReq)
    }

    // @@protoc_insertion_point(class_scope:PlantFlowerEditFlowerCombinationReq)
    private static final emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq();
    }

    public static emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlantFlowerEditFlowerCombinationReq>
        PARSER = new com.google.protobuf.AbstractParser<PlantFlowerEditFlowerCombinationReq>() {
      @java.lang.Override
      public PlantFlowerEditFlowerCombinationReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlantFlowerEditFlowerCombinationReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlantFlowerEditFlowerCombinationReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlantFlowerEditFlowerCombinationReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlantFlowerEditFlowerCombinationReqOuterClass.PlantFlowerEditFlowerCombinationReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerEditFlowerCombinationReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerEditFlowerCombinationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)PlantFlowerEditFlowerCombinationReq.pr" +
      "oto\032\032CustomGadgetTreeInfo.proto\"\205\001\n#Plan" +
      "tFlowerEditFlowerCombinationReq\022\021\n\tentit" +
      "y_id\030\006 \001(\r\0226\n\027flower_combination_info\030\r " +
      "\001(\0132\025.CustomGadgetTreeInfo\022\023\n\013schedule_i" +
      "d\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_PlantFlowerEditFlowerCombinationReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlantFlowerEditFlowerCombinationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerEditFlowerCombinationReq_descriptor,
        new java.lang.String[] { "EntityId", "FlowerCombinationInfo", "ScheduleId", });
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
