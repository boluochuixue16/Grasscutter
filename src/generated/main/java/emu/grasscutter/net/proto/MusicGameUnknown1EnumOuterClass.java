// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameUnknown1Enum.proto

package emu.grasscutter.net.proto;

public final class MusicGameUnknown1EnumOuterClass {
  private MusicGameUnknown1EnumOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MusicGameUnknown1Enum}
   */
  public enum MusicGameUnknown1Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MusicGameUnknown1Enum_NONE = 0;</code>
     */
    MusicGameUnknown1Enum_NONE(0),
    /**
     * <code>MusicGameUnknown1Enum_u2 = 1;</code>
     */
    MusicGameUnknown1Enum_u2(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MusicGameUnknown1Enum_NONE = 0;</code>
     */
    public static final int MusicGameUnknown1Enum_NONE_VALUE = 0;
    /**
     * <code>MusicGameUnknown1Enum_u2 = 1;</code>
     */
    public static final int MusicGameUnknown1Enum_u2_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MusicGameUnknown1Enum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MusicGameUnknown1Enum forNumber(int value) {
      switch (value) {
        case 0: return MusicGameUnknown1Enum_NONE;
        case 1: return MusicGameUnknown1Enum_u2;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MusicGameUnknown1Enum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MusicGameUnknown1Enum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MusicGameUnknown1Enum>() {
            public MusicGameUnknown1Enum findValueByNumber(int number) {
              return MusicGameUnknown1Enum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MusicGameUnknown1Enum[] VALUES = values();

    public static MusicGameUnknown1Enum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MusicGameUnknown1Enum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MusicGameUnknown1Enum)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MusicGameUnknown1Enum.proto*U\n\025MusicGa" +
      "meUnknown1Enum\022\036\n\032MusicGameUnknown1Enum_" +
      "NONE\020\000\022\034\n\030MusicGameUnknown1Enum_u2\020\001B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
